package compilator.object.expression;

import compilator.enums.ExpressionType;
import compilator.value.Value;

public class ExpressionIdentifier extends Expression {

    private Value value;

    public ExpressionIdentifier()
    {
        super(ExpressionType.IDENTIFIER);
    }
}
