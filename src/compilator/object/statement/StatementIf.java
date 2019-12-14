package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.BlockStatement;
import compilator.object.Body;
import compilator.object.expression.Expression;

public class StatementIf extends Statement
{


    private final Expression expression;
    private final BlockStatement bodyIf;
    private final BlockStatement bodyElse;

    public StatementIf(Expression expression, BlockStatement bodyIf, BlockStatement bodyElse)
    {
        super(EStatementType.IF);
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

    public BlockStatement getBodyElse()
    {
        return bodyElse;
    }

    public BlockStatement getBodyIf()
    {
        return bodyIf;
    }

    public Expression getExpression()
    {
        return expression;
    }
}
