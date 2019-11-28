package compilator.object.expression;

import compilator.enums.ExpressionType;
import compilator.enums.OperatorMultiplication;

public class ExpressionMultiplication extends Expression {

    private Expression leftExpression;

    private Expression rightExpression;
    private OperatorMultiplication operatorMultiplication;

    public ExpressionMultiplication(Expression leftExpression, Expression rightExpression, OperatorMultiplication operatorMultiplication)
    {
        super(ExpressionType.MULTIPLICATION);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operatorMultiplication = operatorMultiplication;
    }

    public OperatorMultiplication getOperatorMultiplication() {
        return operatorMultiplication;
    }

    public void setOperatorMultiplication(OperatorMultiplication operatorMultiplication) {
        this.operatorMultiplication = operatorMultiplication;
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
