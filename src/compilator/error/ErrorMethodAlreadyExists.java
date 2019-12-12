package compilator.error;

public class ErrorMethodAlreadyExists extends Error
{
    public ErrorMethodAlreadyExists(String name)
    {
        super("Method with name " + name + " already exists.");
    }
}
