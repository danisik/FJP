package compilator.compilerPart;

import compilator.enums.EExpressionType;
import compilator.enums.EInstruction;
import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;
import compilator.error.*;
import compilator.object.BlockStatement;
import compilator.object.StatementData;
import compilator.object.Variable;
import compilator.object.expression.ExpressionMethodCall;
import compilator.object.instruction.Instruction;
import compilator.object.method.Method;
import compilator.object.method.MethodCall;
import compilator.object.statement.*;
import compilator.object.symbolTable.SymbolTableItem;

public class BlockStatementCompiler extends BaseCompiler
{
    private BlockStatement blockStatement;
    private StatementData statementData;
    private int level;
    private boolean generateMethods = true;
    private boolean increaseStack = true;
    private boolean generateReturn = true;
    private boolean deleteLocalVariables = false;

    public BlockStatementCompiler(BlockStatement blockStatement, int level)
    {
        this.blockStatement = blockStatement;
        this.statementData = blockStatement.getStatementData();
        this.level = level;
    }

    public void run()
    {
        this.incrementStackForVariables();

        this.generateInstructionForStatements();

        // methods generate own return
        if (this.generateReturn)
        {
            this.addInstruction(EInstruction.RET, 0,0);
        }

        // methods are generated only in main body
        if (this.generateMethods)
        {
            // generate methods
            this.generateInstructionForMethods();

            // method calls assignment
            this.initializeMethodsInInstructions();

            // update call levels in multiple calls
            this.updateCallLevel();
        }

        // delete local variables
        if (this.deleteLocalVariables)
        {
            this.deleteLocalVariables();
        }
    }

    private void incrementStackForVariables()
    {
        if (this.increaseStack)
        {
            this.addInstruction(EInstruction.INT, 0, this.BASE_METHOD_SIZE + this.statementData.getVariableDeclarationCount());
        }
    }

    private void generateVariablesToSymbolTable()
    {

    }

    private void generateInstructionForMethods()
    {
        for (Method method: this.blockStatement.getMethods())
        {
            new MethodCompiler(method).run();
        }
    }

    private void generateInstructionForStatements()
    {
        for (Statement statement: this.statementData.getStatements())
        {
            switch (statement.getType())
            {
                case DECLARATION:
                    this.generateDeclarationInstruction((StatementDeclaration) statement);
                    break;
                case ASSIGMENT:
                    this.generateAssigmentInstruction((StatementAssigment) statement);
                    break;
                case IF:
                    this.generateIfInstructions((StatementIf) statement);
                    break;
                case FOR:
                    this.generateForInstructions((StatementFor) statement);
                    break;
                case WHILE:
                    this.generateWhileInstructions((StatementWhile) statement);
                    break;
                case DO_WHILE:
                    this.generateDoWhileInstructions((StatementDo) statement);
                    break;
                case METHOD_CALL:
                    this.generateMethodCallInstructions((StatementMethodCall) statement);
                    break;
                case REPEAT_UNTIL:
                    this.generateRepeatUntilInstructions((StatementRepeat) statement);
                    break;
                case SWITCH:
                    this.generateSwitchInstructions((StatementSwitch) statement);
                    break;
            }
        }
    }

    /**
     * Generate instructions for variable declaration
     * @param statementDeclaration
     */
    private void generateDeclarationInstruction(StatementDeclaration statementDeclaration)
    {
        Variable variable = statementDeclaration.getVariable();

        if (this.isInSymbolTable(variable.getName()))
        {
            this.getErrorHandler().throwError(new ErrorVariableAlreadyExists(variable.getName()));
        }

        switch (variable.getType())
        {
            case INT:
                this.variableIntInstruction(variable);
                break;
            case BOOLEAN:
                this.variableBooleanInstruction(variable);
                break;
        }

        SymbolTableItem symbolTableItem = this.addVariable(variable.getName(), variable);

        if (variable.existsParallel())
        {
            for(String variableName : variable.getParallelArray())
            {
                this.addInstruction(EInstruction.LOD, this.level, symbolTableItem.getAddress());
                this.addVariable(variableName, variable);
            }
        }
    }

    private SymbolTableItem addVariable(String name, Variable variable)
    {
        SymbolTableItem symbolTableItem = new SymbolTableItem(name, this.level, this.getAndIncreaseStackPointer(), 0);
        symbolTableItem.setIsVariable(true);
        symbolTableItem.setConstant(variable.isConstant());
        symbolTableItem.setVariableType(variable.getType());

        this.getSymbolTable().addItem(symbolTableItem);

        this.addInstruction(EInstruction.STO, 0, symbolTableItem.getAddress());

        return symbolTableItem;
    }


    private void variableIntInstruction(Variable variable)
    {
        switch (variable.getVariableDeclaration())
        {
            case DECIMAL:
                this.addInstruction(EInstruction.LIT, 0, variable.getValue().toInt());
                break;
            case METHOD_CALL:
                new MethodCallCompiler(variable.getMethodCall(), 0).run();
                break;
            case IDENTIFIER:
                this.variableAssigmentIdentifier(variable);
                break;
            case EXPRESSION:
                new ExpressionCompiler(variable.getExpression(), EVariableType.INT).run();
                break;
        }
    }

    private void variableBooleanInstruction(Variable variable)
    {
        switch (variable.getVariableDeclaration())
        {
            case BOOLEAN:
                this.addInstruction(EInstruction.LIT, 0, variable.getValue().toBooleanAsInt());
                break;
            case METHOD_CALL:
                new MethodCallCompiler(variable.getMethodCall(), 0).run();
                break;
            case IDENTIFIER:
                this.variableAssigmentIdentifier(variable);
                break;
            case EXPRESSION:
                new ExpressionCompiler(variable.getExpression(), EVariableType.BOOLEAN).run();
                break;
        }
    }

    private void variableAssigmentIdentifier(Variable variable)
    {
        if (this.isInSymbolTable(variable.getValue().toString()))
        {
            this.getErrorHandler().throwError(new ErrorAssignedVariableNotExists(variable.getValue().toString()));
        }

        SymbolTableItem assignedValue = this.getSymbolTable().getItem(variable.getValue().toString());

        if (variable.getType() != assignedValue.getVariableType())
        {
            this.getErrorHandler().throwError(new ErrorMismatchTypesVariable(variable.getName(), variable.getType().toString(), assignedValue.getVariableType().toString()));
        }

        // load value on top
        this.addInstruction(EInstruction.LOD, this.level, assignedValue.getAddress());
    }

    private void generateAssigmentInstruction(StatementAssigment statementAssigment)
    {
        if (this.isInSymbolTable(statementAssigment.getIdentifier()))
        {
            SymbolTableItem symbolTableItem = this.getSymbolTable().getItem(statementAssigment.getIdentifier());

            // need to set methodCall expected return value here. In assigment visitor we dont know variable type
            if (statementAssigment.getExpression().getType() == EExpressionType.METHOD_CALL)
            {
                ExpressionMethodCall expressionMethodCall = (ExpressionMethodCall) statementAssigment.getExpression();
                EMethodReturnType methodReturnType = symbolTableItem.getVariableType() == EVariableType.INT ? EMethodReturnType.INT : EMethodReturnType.BOOLEAN;
                expressionMethodCall.getMethodCall().setExpectedReturnType(methodReturnType);
                new ExpressionCompiler(expressionMethodCall, symbolTableItem.getVariableType()).run();
            }
            else
            {
                statementAssigment.getExpression().setExpectedReturnType(symbolTableItem.getVariableType());
                new ExpressionCompiler(statementAssigment.getExpression(), symbolTableItem.getVariableType()).run();
            }

            this.addInstruction(EInstruction.STO, this.level, symbolTableItem.getAddress());
        }
        else
        {
            this.getErrorHandler().throwError(new ErrorVariableNotExists(statementAssigment.getIdentifier()));
        }
    }

    private void generateIfInstructions(StatementIf statementIf)
    {

    }

    private void generateForInstructions(StatementFor statementFor)
    {

    }

    private void generateWhileInstructions(StatementWhile statementWhile)
    {

    }

    private void generateDoWhileInstructions(StatementDo statementDoWhile)
    {

    }

    private void generateMethodCallInstructions(StatementMethodCall statementMethodCall)
    {
        new MethodCallCompiler(statementMethodCall.getMethodCall(), this.level).run();
    }

    private void generateRepeatUntilInstructions(StatementRepeat statementRepeatUntil)
    {

    }

    private void generateSwitchInstructions(StatementSwitch statementSwitch)
    {

    }

    public void setGenerateMethods(boolean generateMethods)
    {
        this.generateMethods = generateMethods;
    }

    private void initializeMethodsInInstructions()
    {
        for (Instruction instruction : this.getInstructionsList())
        {
            if (instruction.isLaterInitialization())
            {
                MethodCall methodCall = instruction.getMethodCall();

                if (this.isInSymbolTable(methodCall.getIdentifier()))
                {
                    SymbolTableItem symbolTableItem = this.getSymbolTable().getItem(methodCall.getIdentifier());

                    // check expected return call and method return type
                    if (methodCall.getExpectedReturnType() != symbolTableItem.getMethodReturnType())
                    {
                        this.getErrorHandler().throwError(new ErrorMismatchMethodCallReturnType(methodCall.getIdentifier(),
                                                                                                methodCall.getExpectedReturnType(),
                                                                                                symbolTableItem.getMethodReturnType())
                                                                                                );
                    }

                    // check parameters count
                    if (methodCall.getParameters().size() != symbolTableItem.getMethodDeclarationParameters().size())
                    {
                        this.getErrorHandler().throwError(new ErrorInvalidParametersCount(symbolTableItem.getName(), symbolTableItem.getMethodDeclarationParameters().size()));
                    }

                    for (int i = 0 ; i < methodCall.getParameters().size() ; i++)
                    {
                        EVariableType callType = methodCall.getParameters().get(i).getVariableType();
                        EVariableType methodType = symbolTableItem.getMethodDeclarationParameters().get(i).getType();
                        if (callType != methodType)
                        {
                            this.getErrorHandler().throwError(new ErrorMismatchMethodAndCallParameterTypes(methodCall.getIdentifier(), methodType, callType, i + 1));
                        }
                    }

                    instruction.setAddress(symbolTableItem.getAddress());
                }
                else
                {
                    this.getErrorHandler().throwError(new ErrorMethodNotExists(methodCall.getIdentifier()));
                }
            }
        }
    }

    private void deleteLocalVariables()
    {
        for (String name : this.statementData.getVariableNames())
        {
            this.getSymbolTable().getTable().remove(name);
        }
    }

    private void updateCallLevel()
    {
        for (Instruction instruction : this.getInstructionsList())
        {
            if (instruction.getInstruction() == EInstruction.CAL && !instruction.isUpdatedCall())
            {
                int methodCalls = 1;
                for(int i = instruction.getAddress() ; i < instructionsList.size() ; i++)
                {
                    if (instructionsList.get(i).getInstruction() == EInstruction.RET)
                    {
                        break;
                    }
                    else if(instructionsList.get(i).getInstruction() == EInstruction.CAL)
                    {
                        instructionsList.get(i).setUpdatedCall(true);
                        instructionsList.get(i).setLevel(methodCalls);
                        methodCalls++;
                        i = instructionsList.get(i).getAddress();
                    }
                }
            }
        }
    }

    public void setIncreaseStack(boolean increaseStack)
    {
        this.increaseStack = increaseStack;
    }

    public void setGenerateReturn(boolean generateReturn)
    {
        this.generateReturn = generateReturn;
    }

    public void setDeleteLocalVariables(boolean deleteLocalVariables)
    {
        this.deleteLocalVariables = deleteLocalVariables;
    }
}
