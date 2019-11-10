package compilator.type;

import compilator.value.Value;

public class Variable {
    private String name;

    private Value value;

    private boolean isConstant;

    Variable(String name, Value value, boolean isConstant)
    {
        this.name = name;
        this.value = value;
        this.isConstant = isConstant;
    }
}
