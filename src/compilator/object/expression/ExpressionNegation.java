package compilator.object.expression;

import compilator.enums.ExpressionType;

public class ExpressionNegation extends Expression {

    private Expression expression;

    public ExpressionNegation(Expression expression) {
        super(ExpressionType.NEGATION);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
