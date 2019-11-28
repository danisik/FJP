package compilator.object.statement;

import compilator.enums.StatementType;
import compilator.object.Body;
import compilator.object.expression.Expression;

public class StatementIf extends Statement
{


    private final Expression expression;
    private final Body bodyIf;
    private final Body bodyElse;

    public StatementIf(Expression expression, Body bodyIf, Body bodyElse)
    {
        super(StatementType.IF);
        this.expression = expression;
        this.bodyIf = bodyIf;
        this.bodyElse = bodyElse;
    }

    public Boolean hasElse()
    {
        if (this.getBodyElse() != null)
        {
            return true;
        }

        return false;
    }

    public Body getBodyElse()
    {
        return bodyElse;
    }

    public Body getBodyIf()
    {
        return bodyIf;
    }

    public Expression getExpression()
    {
        return expression;
    }
}
