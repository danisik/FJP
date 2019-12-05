package compilator.object.statement;

import compilator.enums.StatementType;
import compilator.object.Variable;

public class StatementDeclaration extends Statement
{
    private final Variable variable;

    public StatementDeclaration(Variable variable)
    {
        super(StatementType.DECLARATION);
        this.variable = variable;
    }

    public Variable getVariable()
    {
        return variable;
    }
}
