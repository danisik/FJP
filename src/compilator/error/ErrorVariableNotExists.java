package compilator.error;

public class ErrorVariableNotExists extends Error
{
    public ErrorVariableNotExists(String value, int line)
    {
        super("Variable " + value + " not exists", line);
    }
}
