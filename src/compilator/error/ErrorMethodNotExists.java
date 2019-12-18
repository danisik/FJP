package compilator.error;

public class ErrorMethodNotExists extends Error
{
    public ErrorMethodNotExists(String method, int line)
    {
        super("Method " + method + " not exists.", line);
    }
}
