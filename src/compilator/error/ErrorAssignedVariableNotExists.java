package compilator.error;

public class ErrorAssignedVariableNotExists extends Error
{
    public ErrorAssignedVariableNotExists(String identifier, int line)
    {
        super("Assigned variable " + identifier + " not exists.", line);
    }
}
