package compilator.value;

public class Value {
    final private Object value;

    public Value(Object value) {
        this.value = value;
    }

    int asInt() {
        return (Integer) value;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
