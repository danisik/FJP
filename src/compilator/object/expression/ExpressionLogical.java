package compilator.object.expression;

import compilator.enums.ExpressionType;
import compilator.enums.OperatorLogical;

public class ExpressionLogical extends Expression{

    private Expression leftExpression;

    private Expression rightExpression;

    private OperatorLogical additiveOperator;

    public ExpressionLogical()
    {
        super(ExpressionType.LOGICAL);
    }
}
