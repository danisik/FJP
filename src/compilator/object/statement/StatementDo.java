package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.BlockStatement;
import compilator.object.Body;
import compilator.object.expression.Expression;

public class StatementDo extends Statement
{

    private final Expression expression;
    private final BlockStatement body;

    public StatementDo(Expression expression, BlockStatement body)
    {
        super(EStatementType.DO_WHILE);
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
