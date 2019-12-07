package compilator.error;

public class ErrorVariableAlreadyExists extends Error
{
    public ErrorVariableAlreadyExists(String identifier)
    {
        super("Variable " + identifier + " already exists");
    }
}
