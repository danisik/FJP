package compilator.object.expression;

import compilator.enums.ExpressionType;

public class ExpressionPar extends Expression {
    private Expression expression;

    public ExpressionPar()
    {
        super(ExpressionType.PAR);
    }
}
