package compilator.compilerPart;

import compilator.enums.EInstruction;
import compilator.error.ErrorAssignedVariableNotExists;
import compilator.error.ErrorMismatchTypes;
import compilator.error.ErrorVariableAlreadyExists;
import compilator.object.BlockStatement;
import compilator.object.StatementData;
import compilator.object.Variable;
import compilator.object.statement.*;
import compilator.object.symbolTable.SymbolTableItem;

public class BlockStatementCompiler extends BaseCompiler
{
    private BlockStatement blockStatement;
    private StatementData statementData;
    private int level;

    public BlockStatementCompiler(BlockStatement blockStatement, int level)
    {
        this.blockStatement = blockStatement;
        this.statementData = blockStatement.getStatementData();
        this.level = level;
    }

    public void run()
    {
        this.incrementStackForVariables();
        this.generateInstructionForMethods();
        this.generateInstructionForStatements();
    }

    private void incrementStackForVariables()
    {
        this.addInstruction(EInstruction.INT, 0, this.BASE_METHOD_SIZE + this.statementData.getVariableDeclarationCount());
    }

    private void generateInstructionForMethods()
    {

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

        this.addInstruction(EInstruction.STO, this.level, symbolTableItem.getAddress());

        return symbolTableItem;
    }


    private void variableIntInstruction(Variable variable)
    {
        switch (variable.getVariableDeclaration())
        {
            case DECIMAL:
                this.addInstruction(EInstruction.LIT, this.level, variable.getValue().toInt());
                break;
            case METHOD_CALL:
                // TODO: 07/12/2019
                break;
            case IDENTIFIER:
                this.variableAssigmentIdentifier(variable);
                break;
        }
    }

    private void variableBooleanInstruction(Variable variable)
    {
        switch (variable.getVariableDeclaration())
        {
            case BOOLEAN:
                this.addInstruction(EInstruction.LIT, this.level, variable.getValue().toBooleanAsInt());
                break;
            case METHOD_CALL:
                // TODO: 07/12/2019
                break;
            case IDENTIFIER:
                this.variableAssigmentIdentifier(variable);
                break;
            case EXPRESSION:
                break;
        }
    }

    private void variableAssigmentIdentifier(Variable variable)
    {
        if (this.isInSymbolTable(variable.getValue().toString()))
        {
            SymbolTableItem assignedValue = this.getSymbolTable().getItem(variable.getValue().toString());

            if (variable.getType() != assignedValue.getVariableType())
            {
                this.getErrorHandler().throwError(new ErrorMismatchTypes(variable.getName(), variable.getType().toString(), assignedValue.getVariableType().toString()));
            }

            // load value on top
            this.addInstruction(EInstruction.LOD, this.level, assignedValue.getAddress());
        }
        else
        {
            this.getErrorHandler().throwError(new ErrorAssignedVariableNotExists(variable.getValue().toString()));
        }
    }

    private void generateAssigmentInstruction(StatementAssigment statementAssigment)
    {

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

    }

    private void generateRepeatUntilInstructions(StatementRepeat statementRepeatUntil)
    {

    }

    private void generateSwitchInstructions(StatementSwitch statementSwitch)
    {

    }

}
