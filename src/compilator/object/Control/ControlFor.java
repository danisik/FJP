package compilator.object.Control;

public class ControlFor
{

    private final String identifier;
    private final int from;
    private final int to;

    public ControlFor(String identifier, int from, int to)
    {

        this.identifier = identifier;
        this.from = from;
        this.to = to;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public int getFrom()
    {
        return from;
    }

    public int getTo()
    {
        return to;
    }
}
