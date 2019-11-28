package compilator.object.expression;

import compilator.enums.ExpressionType;
import compilator.enums.OperatorLogical;
import compilator.enums.OperatorMultiplication;

public class ExpressionLogical extends Expression{

    private Expression leftExpression;

    private Expression rightExpression;
    private OperatorLogical operatorLogical;

    public ExpressionLogical(Expression leftExpression, Expression rightExpression, OperatorLogical operatorLogical)
    {
        super(ExpressionType.LOGICAL);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operatorLogical = operatorLogical;
    }

    public OperatorLogical getOperatorLogical() {
        return operatorLogical;
    }

    public void setOperatorLogical(OperatorLogical operatorLogical) {
        this.operatorLogical = operatorLogical;
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
