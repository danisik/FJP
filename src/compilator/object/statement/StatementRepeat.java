package compilator.object.statement;

import compilator.enums.StatementType;

public class StatementRepeat extends Statement {
    public StatementRepeat() {
        super(StatementType.REPEAT_UNTIL);
    }
}
