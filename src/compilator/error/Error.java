package compilator.error;

public class Error
{
    private String message;
    private int line;

    public Error(String message, int line)
    {
        this.message = message;
        this.line = line;
    }

    @Override
    public String toString()
    {
        return "Line: " + line + " : " + message;
    }
}
