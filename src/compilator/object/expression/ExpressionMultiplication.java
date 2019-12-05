package compilator.object.expression;

import compilator.enums.EExpressionType;
import compilator.enums.EOperatorMultiplication;

public class ExpressionMultiplication extends Expression {

    private Expression leftExpression;

    private Expression rightExpression;
    private EOperatorMultiplication operatorMultiplication;

    public ExpressionMultiplication(Expression leftExpression, Expression rightExpression, EOperatorMultiplication operatorMultiplication)
    {
        super(EExpressionType.MULTIPLICATION);
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operatorMultiplication = operatorMultiplication;
    }

    public EOperatorMultiplication getOperatorMultiplication() {
        return operatorMultiplication;
    }

    public void setOperatorMultiplication(EOperatorMultiplication operatorMultiplication) {
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
