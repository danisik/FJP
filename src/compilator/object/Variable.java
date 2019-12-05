package compilator.object;

import compilator.enums.EVariableType;
import compilator.value.Value;

import java.util.ArrayList;
import java.util.List;

public class Variable {
    private String name;

    private Value value;

    private boolean isConstant;

    private EVariableType type;

    private List<String> parallelArray;

    public Variable(String name, Value value, EVariableType type)
    {
        this.name = name;
        this.value = value;
        this.type = type;
        this.isConstant = false;
        this.parallelArray = new ArrayList<>();
    }

    public Variable(String name, Value value, EVariableType type, boolean isConstant)
    {
        this.name = name;
        this.value = value;
        this.type = type;
        this.isConstant = isConstant;
        this.parallelArray = new ArrayList<>();
    }

    public boolean existsParallel()
    {
        if (this.parallelArray.size() == 0)
        {
            return false;
        }

        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public boolean isConstant() {
        return isConstant;
    }

    public void setConstant(boolean constant) {
        isConstant = constant;
    }

    public EVariableType getType() {
        return type;
    }

    public void setType(EVariableType type) {
        this.type = type;
    }

    public List<String> getParallelArray() {
        return parallelArray;
    }

    public void setParallelArray(List<String> parallelArray) {
        this.parallelArray = parallelArray;
    }


}
