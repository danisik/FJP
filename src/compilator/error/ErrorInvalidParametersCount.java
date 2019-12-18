package compilator.error;

public class ErrorInvalidParametersCount extends Error
{
    public ErrorInvalidParametersCount(String name, int count, int line)
    {
        super("Invalid call of method \"" + name + "\". Mismatch parameters count. Method has " + count + " parameters.", line);
    }
}
