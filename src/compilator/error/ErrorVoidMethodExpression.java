package compilator.error;

public class ErrorVoidMethodExpression extends Error
{
    public ErrorVoidMethodExpression(String name)
    {
        super("Void method \"" + name + "\" can not be used in expression.");
    }
}
