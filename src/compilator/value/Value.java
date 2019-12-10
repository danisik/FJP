package compilator.value;

public class Value
{
    final private Object value;

    public Value(Object value)
    {
        this.value = value;
    }

    public int toInt()
    {
        return Integer.parseInt(this.value.toString());
    }

    public String toString()
    {
        return (String) this.value;
    }

    public int toBooleanAsInt()
    {
        return ((Boolean) this.value) ? 1 : 0;
    }
}
