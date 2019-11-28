package compilator.object.statement;

import compilator.enums.StatementType;
import compilator.object.Body;
import compilator.object.Control.ControlFor;

public class StatementFor extends Statement
{
    private final ControlFor controlFor;
    private final Body body;

    public StatementFor(ControlFor controlFor, Body body)
    {
        super(StatementType.FOR);
        this.controlFor = controlFor;
        this.body = body;
    }

    public Body getBody()
    {
        return body;
    }

    public ControlFor getControlFor()
    {
        return controlFor;
    }
}
