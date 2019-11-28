package compilator.object.expression;

import compilator.enums.ExpressionType;
import compilator.value.Value;

public class ExpressionIdentifier extends Expression {

    private Value value;

    public ExpressionIdentifier(Value value)
    {
        super(ExpressionType.IDENTIFIER);
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
