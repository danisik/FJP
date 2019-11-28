package compilator.object.statement;

import compilator.enums.StatementType;
import compilator.object.Body;
import compilator.object.expression.Expression;

public class StatementDo extends Statement
{

    private final Expression expression;
    private final Body body;

    public StatementDo(Expression expression, Body body)
    {
        super(StatementType.DO_WHILE);
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
