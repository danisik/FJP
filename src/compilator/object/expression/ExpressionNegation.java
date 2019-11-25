package compilator.object.expression;

import compilator.enums.ExpressionType;

public class ExpressionNegation extends Expression {

    private Expression expression;

    public ExpressionNegation() {
        super(ExpressionType.NEGATION);
    }
}
