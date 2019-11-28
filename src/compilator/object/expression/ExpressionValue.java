package compilator.object.expression;

import compilator.enums.ExpressionType;
import compilator.value.Value;

public class ExpressionValue extends Expression {

    private Value value;
    
    public ExpressionValue(Value value)
    {
        super(ExpressionType.VALUE);
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
