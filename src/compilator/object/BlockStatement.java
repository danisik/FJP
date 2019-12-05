package compilator.object;


public class BlockStatement {

    private StatementData statementData;

    public BlockStatement(StatementData statementData)
    {
        this.statementData = statementData;
    }

    public StatementData getStatementData()
    {
        return statementData;
    }
}
