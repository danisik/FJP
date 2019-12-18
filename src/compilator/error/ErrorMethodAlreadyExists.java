package compilator.error;

public class ErrorMethodAlreadyExists extends Error
{
    public ErrorMethodAlreadyExists(String name, int line)
    {
        super("Method with name " + name + " already exists.", line);
    }
}
