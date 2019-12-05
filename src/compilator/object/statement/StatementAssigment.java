package compilator.object.statement;

import compilator.enums.StatementType;
import compilator.object.expression.Expression;

public class StatementAssigment extends Statement
{
    private final String identifier;

    private final Expression expression;

    public StatementAssigment(String identifier, Expression expression)
    {
        super(StatementType.ASSIGMENT);
        this.identifier = identifier;
        this.expression = expression;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public Expression getExpression()
    {
        return expression;
    }
}
