package compilator.object.expression;

import compilator.enums.ExpressionType;
import compilator.enums.OperatorRelational;

public class ExpressionRelational extends Expression{
    private Expression leftExpression;

    private Expression rightExpression;

    private OperatorRelational additiveOperator;

    public ExpressionRelational()
    {
        super(ExpressionType.RELATIONAL);
    }
}
