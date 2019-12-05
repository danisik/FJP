package compilator.object.statement;

import compilator.enums.EStatementType;

import java.util.HashMap;

public class StatementSwitch extends Statement
{
    private HashMap<Integer, StatementSwitchBlock> blocks;
    private final StatementSwitchBlock defaultBlock;

    public StatementSwitch(HashMap<Integer, StatementSwitchBlock> blocks, StatementSwitchBlock defaultBlock)
    {
        super(EStatementType.SWITCH);
        this.blocks = blocks;
        this.defaultBlock = defaultBlock;
    }

    public StatementSwitchBlock getDefaultBlock()
    {
        return defaultBlock;
    }

    public HashMap<Integer, StatementSwitchBlock> getBlocks()
    {
        return blocks;
    }
}
