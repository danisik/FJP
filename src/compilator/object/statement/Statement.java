package compilator.object.statement;

import compilator.enums.EStatementType;

public class Statement {

    private EStatementType type;
    private int line;

    public Statement(EStatementType type, int line)
    {
        this.type = type;
        this.line = line;
    }

    public EStatementType getType() {
        return type;
    }

    public void setType(EStatementType type) {
        this.type = type;
    }

    public int getLine()
    {
        return line;
    }
}
