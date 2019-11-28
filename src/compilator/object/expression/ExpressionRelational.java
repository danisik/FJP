package compilator.object.expression;

import compilator.enums.ExpressionType;
import compilator.enums.OperatorRelational;

public class ExpressionRelational extends Expression{
    private Expression leftExpression;

    private Expression rightExpression;

    private OperatorRelational operatorRelational;

    public ExpressionRelational(Expression leftExpression, Expression rightExpression, OperatorRelational operatorRelational)
    {
        super(ExpressionType.RELATIONAL);
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

    public OperatorRelational getOperatorRelational() {
        return operatorRelational;
    }

    public void setOperatorRelational(OperatorRelational operatorRelational) {
        this.operatorRelational = operatorRelational;
    }
}
