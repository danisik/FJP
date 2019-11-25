package compilator.object.expression;

import compilator.enums.OperatorAdditive;
import compilator.enums.ExpressionType;

public class ExpressionAdditive extends Expression {

    private Expression leftExpression;

    private Expression rightExpression;

    private OperatorAdditive operatorAdditive;

    public ExpressionAdditive() {
        super(ExpressionType.ADDITIVE);
    }
}
