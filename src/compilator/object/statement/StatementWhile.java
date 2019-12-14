package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.BlockStatement;
import compilator.object.Body;
import compilator.object.expression.Expression;

public class StatementWhile extends Statement
{

    private final Expression expression;
    private final BlockStatement body;

    public StatementWhile(Expression expression, BlockStatement body)
    {
        super(EStatementType.WHILE);
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
