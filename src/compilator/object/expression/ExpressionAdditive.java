package compilator.object.expression;

import compilator.enums.EOperatorAdditive;
import compilator.enums.EExpressionType;

public class ExpressionAdditive extends Expression {

    private Expression leftExpression;

    private Expression rightExpression;

    private EOperatorAdditive operatorAdditive;

    public ExpressionAdditive(Expression leftExpression, Expression rightExpression, EOperatorAdditive operatorAdditive) {
        super(EExpressionType.ADDITIVE);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operatorAdditive = operatorAdditive;
    }

    public EOperatorAdditive getOperatorAdditive() {
        return operatorAdditive;
    }

    public void setOperatorAdditive(EOperatorAdditive operatorAdditive) {
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
