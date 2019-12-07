package compilator.error;

public class ErrorAssignedVariableNotExists extends Error
{
    public ErrorAssignedVariableNotExists(String identifier)
    {
        super("Assigned variable " + identifier + " not exists.");
    }
}
