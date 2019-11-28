package compilator.object.statement;

import compilator.enums.StatementType;
import compilator.object.Body;
import compilator.object.expression.Expression;

public class StatementRepeat extends Statement
{
    private final Expression expression;
    private final Body body;

    public StatementRepeat(Expression expression, Body body)
    {
        super(StatementType.REPEAT_UNTIL);
        this.expression = expression;
        this.body = body;
    }

    public Body getBody()
    {
        return body;
    }

    public Expression getExpression()
    {
        return expression;
    }
}
