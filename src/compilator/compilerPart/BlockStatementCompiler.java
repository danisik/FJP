package compilator.compilerPart;

import compilator.enums.EInstruction;
import compilator.enums.EStatementType;
import compilator.object.BlockStatement;
import compilator.object.StatementData;
import compilator.object.Variable;
import compilator.object.statement.Statement;
import compilator.object.statement.StatementDeclaration;
import compilator.object.symbolTable.SymbolTable;
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

                    break;
                case IF:

                    break;
                case FOR:

                    break;
                case WHILE:

                    break;
                case DO_WHILE:

                    break;
                case METHOD_CALL:

                    break;
                case REPEAT_UNTIL:

                    break;
                case SWITCH:

                    break;
            }
        }
    }

    private void generateDeclarationInstruction(StatementDeclaration statementDeclaration)
    {
        Variable variable = statementDeclaration.getVariable();
        SymbolTableItem symbolTableItem = new SymbolTableItem(variable.getName(), this.level, this.getAndIncreaseStackPointer(), 0);


        this.getSymbolTable().addItem(symbolTableItem);

        this.addInstruction(EInstruction.LIT, this.level, 1);
        this.addInstruction(EInstruction.STO, this.level, symbolTableItem.getAddress());
    }

    private void generateAssigmentInstruction()
    {

    }

}
