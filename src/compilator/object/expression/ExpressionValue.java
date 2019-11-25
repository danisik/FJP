package compilator.object.expression;

import compilator.enums.ExpressionType;
import compilator.value.Value;

public class ExpressionValue extends Expression {

    private Value value;
    
    public ExpressionValue()
    {
        super(ExpressionType.VALUE);
    }
}
