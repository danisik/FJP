package compilator.object.statement;

import compilator.enums.EStatementType;

public class Statement {

    private EStatementType type;

    public Statement(EStatementType type)
    {
        this.type = type;
    }

    public EStatementType getType() {
        return type;
    }

    public void setType(EStatementType type) {
        this.type = type;
    }
}
