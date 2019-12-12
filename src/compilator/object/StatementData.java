package compilator.object;

import compilator.enums.EStatementType;
import compilator.object.statement.Statement;
import compilator.object.statement.StatementDeclaration;

import java.util.ArrayList;
import java.util.List;

public class StatementData
{
    private List<Statement> statements;
    private List<String> variableNames;

    public StatementData(List<Statement> statements)
    {
        this.statements = statements;
        this.variableNames = this.createVariableNamesList();
    }

    public int getVariableDeclarationCount()
    {
        return this.variableNames.size();
    }

    private List<String> createVariableNamesList()
    {
        List<String> list = new ArrayList<>();
        for (Statement statement: statements)
        {
            if (statement.getType() == EStatementType.DECLARATION)
            {
                StatementDeclaration statementDeclaration = (StatementDeclaration) statement;
                Variable variable = statementDeclaration.getVariable();

                list.add(variable.getName());

                if (variable.existsParallel())
                {
                    list.addAll(variable.getParallelArray());
                }
            }
        }

        return list;
    }

    public List<String> getVariableNames()
    {
        return variableNames;
    }

    public List<Statement> getStatements()
    {
        return this.statements;
    }

}
