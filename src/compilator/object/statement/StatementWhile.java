package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.Body;
import compilator.object.expression.Expression;

public class StatementWhile extends Statement
{

    private final Expression expression;
    private final Body body;

    public StatementWhile(Expression expression, Body body)
    {
        super(EStatementType.WHILE);
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
