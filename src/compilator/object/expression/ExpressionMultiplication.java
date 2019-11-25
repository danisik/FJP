package compilator.object.expression;

import compilator.enums.ExpressionType;
import compilator.enums.OperatorMultiplication;

public class ExpressionMultiplication extends Expression {

    private Expression leftExpression;

    private Expression rightExpression;

    private OperatorMultiplication additiveOperator;

    public ExpressionMultiplication()
    {
        super(ExpressionType.MULTIPLICATION);
    }
}
