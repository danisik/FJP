package compilator.object.expression;

import compilator.enums.EExpressionType;
import compilator.value.Value;

public class ExpressionIdentifier extends Expression {

    private Value value;

    public ExpressionIdentifier(Value value)
    {
        super(EExpressionType.IDENTIFIER);
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
