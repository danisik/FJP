package compilator.object;

import compilator.enums.EStatementType;
import compilator.object.statement.Statement;
import compilator.object.statement.StatementDeclaration;
import java.util.List;

public class StatementData
{
    private List<Statement> statements;

    public StatementData(List<Statement> statements)
    {
        this.statements = statements;
    }

    public int getVariableDeclarationCount()
    {
        int count = 0;

        for (Statement statement: statements) {
            if (statement.getType() == EStatementType.DECLARATION)
            {
                StatementDeclaration statementDeclaration = (StatementDeclaration) statement;
                Variable variable = statementDeclaration.getVariable();
                System.out.println(variable.getName() + " " + variable.getParallelArray().size());
                count += (1 + variable.getParallelArray().size());
            }
        }

        return count;
    }

    public List<Statement> getStatements()
    {
        return this.statements;
    }

}
