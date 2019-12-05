package compilator.object.expression;

import compilator.enums.EExpressionType;

public class ExpressionPar extends Expression {
    private Expression expression;

    public ExpressionPar(Expression expression)
    {
        super(EExpressionType.PAR);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
