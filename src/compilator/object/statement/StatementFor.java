package compilator.object.statement;

import compilator.enums.EStatementType;
import compilator.object.BlockStatement;
import compilator.object.Body;
import compilator.object.control.ControlFor;

public class StatementFor extends Statement
{
    private final ControlFor controlFor;
    private final BlockStatement body;

    public StatementFor(ControlFor controlFor, BlockStatement body)
    {
        super(EStatementType.FOR);
        this.controlFor = controlFor;
        this.body = body;
    }

    public BlockStatement getBody()
    {
        return body;
    }

    public ControlFor getControlFor()
    {
        return controlFor;
    }
}
