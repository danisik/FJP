package compilator.object.expression;

import compilator.enums.OperatorAdditive;
import compilator.enums.ExpressionType;

public class ExpressionAdditive extends Expression {

    private Expression leftExpression;

    private Expression rightExpression;

    private OperatorAdditive operatorAdditive;

    public ExpressionAdditive(Expression leftExpression, Expression rightExpression, OperatorAdditive operatorAdditive) {
        super(ExpressionType.ADDITIVE);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operatorAdditive = operatorAdditive;
    }

    public OperatorAdditive getOperatorAdditive() {
        return operatorAdditive;
    }

    public void setOperatorAdditive(OperatorAdditive operatorAdditive) {
        this.operatorAdditive = operatorAdditive;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }
}
