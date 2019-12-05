package compilator.object;


import compilator.object.method.Method;

import java.util.List;

public class BlockStatement {

    private StatementData statementData;
    private List<Method> methods;

    public BlockStatement(StatementData statementData, List<Method> methods)
    {
        this.statementData = statementData;
        this.methods = methods;
    }

    public StatementData getStatementData()
    {
        return statementData;
    }

    public List<Method> getMethods()
    {
        return methods;
    }
}
