package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.BlockStatement;
import compilator.object.Body;
import compilator.object.expression.Expression;

public class StatementRepeat extends Statement
{
    private final Expression expression;
    private final BlockStatement body;

    public StatementRepeat(Expression expression, BlockStatement body)
    {
        super(EStatementType.REPEAT_UNTIL);
        this.expression = expression;
        this.body = body;
    }

    public BlockStatement getBody()
    {
        return body;
    }

    public Expression getExpression()
    {
        return expression;
    }
}
