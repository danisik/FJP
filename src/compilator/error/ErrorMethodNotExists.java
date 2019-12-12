package compilator.error;

public class ErrorMethodNotExists extends Error
{
    public ErrorMethodNotExists(String method)
    {
        super("Method " + method + " not exists.");
    }
}
