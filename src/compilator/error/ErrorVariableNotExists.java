package compilator.error;

public class ErrorVariableNotExists extends Error
{
    public ErrorVariableNotExists(String value)
    {
        super("Variable " + value + " not exists");
    }
}
