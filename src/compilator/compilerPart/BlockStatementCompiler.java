package compilator.compilerPart;

import compilator.enums.*;
import compilator.error.*;
import compilator.object.BlockStatement;
import compilator.object.Body;
import compilator.object.StatementData;
import compilator.object.Variable;
import compilator.object.expression.ExpressionMethodCall;
import compilator.object.instruction.Instruction;
import compilator.object.method.Method;
import compilator.object.method.MethodCall;
import compilator.object.statement.*;
import compilator.object.symbolTable.SymbolTableItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BlockStatementCompiler extends BaseCompiler
{
    private BlockStatement blockStatement;
    private StatementData statementData;
    private int level;
    private boolean generateMethods = true;
    private boolean increaseStack = true;
    private boolean generateReturn = true;
    private boolean deleteLocalVariables = false;
    private boolean createLocalSpaceForLocalVariables = false;

    public BlockStatementCompiler(BlockStatement blockStatement, int level)
    {
        this.blockStatement = blockStatement;

        if (blockStatement != null)
        {
            this.statementData = blockStatement.getStatementData();
        }
        this.level = level;
    }

    public void run()
    {
        if (this.blockStatement == null)
        {
            return;
        }

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

            if (this.createLocalSpaceForLocalVariables && this.statementData.getVariableDeclarationCount() != 0)
            {
                this.addInstruction(EInstruction.INT, 0, -this.statementData.getVariableDeclarationCount());
            }
        }
    }

    private void incrementStackForVariables()
    {
        if (this.increaseStack)
        {
            this.addInstruction(EInstruction.INT, 0, this.BASE_METHOD_SIZE + this.statementData.getVariableDeclarationCount() + this.statementData.getForStatementCount());
        }

        if (this.createLocalSpaceForLocalVariables && this.statementData.getVariableDeclarationCount() != 0)
        {
            this.addInstruction(EInstruction.INT, 0, this.statementData.getVariableDeclarationCount());
        }
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
        new ExpressionCompiler(statementIf.getExpression(), EVariableType.BOOLEAN).run();

        int jmcElseRow = this.getInstructionsCounter();

        // jmo to else/end if
        this.addInstruction(EInstruction.JMC, 0, -1); // address is set later

        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementIf.getBodyIf(), 0);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        int jmpEndIfStatement = this.getInstructionsCounter();

        // jump over else block if exists
        if (statementIf.hasElse())
        {
            this.addInstruction(EInstruction.JMP, 0, -1); // address is set later
        }

        // set address to else/end if address
        this.getInstructionsList().get(jmcElseRow).setAddress(this.getInstructionsCounter());

        if (statementIf.hasElse())
        {
            BlockStatementCompiler blockStatementCompilerElse = new BlockStatementCompiler(statementIf.getBodyElse(), 0);
            blockStatementCompilerElse.setUpInnerBodySettings();
            blockStatementCompilerElse.run();

            // set address to else end
            this.getInstructionsList().get(jmpEndIfStatement).setAddress(this.getInstructionsCounter());
        }
    }

    private void generateForInstructions(StatementFor statementFor)
    {
        if (this.isInSymbolTable(statementFor.getControlFor().getIdentifier()))
        {
            this.getErrorHandler().throwError(new ErrorVariableAlreadyExists(statementFor.getControlFor().getIdentifier()));
        }

        new ExpressionCompiler(statementFor.getControlFor().getFrom(), EVariableType.INT).run();

        SymbolTableItem symbolTableItem = new SymbolTableItem(statementFor.getControlFor().getIdentifier(), this.level, this.getAndIncreaseStackPointer(), 0);
        symbolTableItem.setIsVariable(true);
        symbolTableItem.setVariableType(EVariableType.INT);

        this.getSymbolTable().addItem(symbolTableItem);

        this.addInstruction(EInstruction.STO, 0, symbolTableItem.getAddress());

        int startIndex = this.getInstructionsCounter();

        this.addInstruction(EInstruction.LOD, 0, symbolTableItem.getAddress());

        new ExpressionCompiler(statementFor.getControlFor().getTo(), EVariableType.INT).run();

        this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.LESS_EQ.getCode());

        int jmcEndIndex = this.getInstructionsCounter();
        this.addInstruction(EInstruction.JMC, 0, -1);


        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementFor.getBody(), 0);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        this.addInstruction(EInstruction.LOD, 0, symbolTableItem.getAddress());
        this.addInstruction(EInstruction.LIT, 0, 1);
        this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.PLUS.getCode());
        this.addInstruction(EInstruction.STO, 0, symbolTableItem.getAddress());
        this.addInstruction(EInstruction.JMP, 0, startIndex);

        this.getInstructionsList().get(jmcEndIndex).setAddress(this.getInstructionsCounter());
    }

    private void generateWhileInstructions(StatementWhile statementWhile)
    {
        int startIndex = this.getInstructionsCounter();
        new ExpressionCompiler(statementWhile.getExpression(), EVariableType.BOOLEAN).run();

        int jmcIndex = this.getInstructionsCounter();
        this.addInstruction(EInstruction.JMC, 0, -1);

        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementWhile.getBody(), 0);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        // jump to start
        this.addInstruction(EInstruction.JMP, 0, startIndex);

        // update jmc address
        this.getInstructionsList().get(jmcIndex).setAddress(this.getInstructionsCounter());
    }

    private void generateDoWhileInstructions(StatementDo statementDoWhile)
    {
        int startIndex = this.getInstructionsCounter();

        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementDoWhile.getBody(), 0);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        new ExpressionCompiler(statementDoWhile.getExpression(), EVariableType.BOOLEAN).run();

        int jmcIndex = this.getInstructionsCounter();
        this.addInstruction(EInstruction.JMC, 0, -1);

        // jmp to start
        this.addInstruction(EInstruction.JMP, 0, startIndex);

        // update jmc address
        this.getInstructionsList().get(jmcIndex).setAddress(this.getInstructionsCounter());

    }

    private void generateMethodCallInstructions(StatementMethodCall statementMethodCall)
    {
        new MethodCallCompiler(statementMethodCall.getMethodCall(), this.level).run();
    }

    private void generateRepeatUntilInstructions(StatementRepeat statementRepeatUntil)
    {
        int startAddress = this.getInstructionsCounter();

        BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementRepeatUntil.getBody(), 0);
        blockStatementCompiler.setUpInnerBodySettings();
        blockStatementCompiler.run();

        new ExpressionCompiler(statementRepeatUntil.getExpression(), EVariableType.BOOLEAN).run();

        // jump back if false
        this.addInstruction(EInstruction.JMC, 0, startAddress);
    }

    private void generateSwitchInstructions(StatementSwitch statementSwitch)
    {
        ArrayList<Integer> jmpIndexes = new ArrayList<>();

        for(Map.Entry<Integer, StatementSwitchBlock> block : statementSwitch.getBlocks().entrySet()) {
            int key = block.getKey();
            StatementSwitchBlock body = block.getValue();

            new ExpressionCompiler(statementSwitch.getExpression(), EVariableType.INT).run();

            this.addInstruction(EInstruction.LIT, 0, key);
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.EQ.getCode());

            int jmcIndex = this.getInstructionsCounter();
            this.addInstruction(EInstruction.JMC, 0, -1);

            BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(body.getBody(), 0);
            blockStatementCompiler.setUpInnerBodySettings();
            blockStatementCompiler.run();

            int jmpEndIndex = this.getInstructionsCounter();
            jmpIndexes.add(jmpEndIndex);
            this.addInstruction(EInstruction.JMP, 0, -1);

            this.getInstructionsList().get(jmcIndex).setAddress(this.getInstructionsCounter());
        }

        // default block
        if (statementSwitch.getDefaultBlock() != null)
        {
            BlockStatementCompiler blockStatementCompiler = new BlockStatementCompiler(statementSwitch.getDefaultBlock().getBody(), 0);
            blockStatementCompiler.setUpInnerBodySettings();
            blockStatementCompiler.run();
        }

        int currentInstructionCounter = this.getInstructionsCounter();

        // initialize jumps out of switch
        for (int index : jmpIndexes)
        {
            this.getInstructionsList().get(index).setAddress(currentInstructionCounter);
        }
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

    public void setUpInnerBodySettings()
    {
        this.setGenerateMethods(false);
        this.setIncreaseStack(false);
        this.setGenerateReturn(false);
        this.setDeleteLocalVariables(true);
        this.setCreateLocalSpaceForLocalVariables(true);
    }

    public void setCreateLocalSpaceForLocalVariables(boolean createLocalSpaceForLocalVariables)
    {
        this.createLocalSpaceForLocalVariables = createLocalSpaceForLocalVariables;
    }
}
