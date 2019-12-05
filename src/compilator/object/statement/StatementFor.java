package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.Body;
import compilator.object.control.ControlFor;

public class StatementFor extends Statement
{
    private final ControlFor controlFor;
    private final Body body;

    public StatementFor(ControlFor controlFor, Body body)
    {
        super(EStatementType.FOR);
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
