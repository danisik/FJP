package compilator.object.expression;

import compilator.enums.EExpressionType;
import compilator.enums.EOperatorRelational;

public class ExpressionRelational extends Expression{
    private Expression leftExpression;

    private Expression rightExpression;

    private EOperatorRelational operatorRelational;

    public ExpressionRelational(Expression leftExpression, Expression rightExpression, EOperatorRelational operatorRelational)
    {
        super(EExpressionType.RELATIONAL);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operatorRelational = operatorRelational;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(Expression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(Expression rightExpression) {
        this.rightExpression = rightExpression;
    }

    public EOperatorRelational getOperatorRelational() {
        return operatorRelational;
    }

    public void setOperatorRelational(EOperatorRelational operatorRelational) {
        this.operatorRelational = operatorRelational;
    }
}
