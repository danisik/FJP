package compilator.visitor;


import compilator.object.statement.*;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;


public class StatementVisitor extends SimpleJavaBaseVisitor<Statement> {

    @Override
    public StatementIf visitStatementIf(SimpleJavaParser.StatementIfContext ctx)
    {
        return new StatementIf();
    }

    @Override
    public StatementFor visitStatementFor(SimpleJavaParser.StatementForContext ctx)
    {
        return new StatementFor();
    }

    @Override
    public StatementWhile visitStatementWhile(SimpleJavaParser.StatementWhileContext ctx)
    {
        return new StatementWhile();
    }

    @Override public StatementDo visitStatementDo(SimpleJavaParser.StatementDoContext ctx)
    {
        return new StatementDo();
    }

    @Override
    public StatementSwitch visitStatementSwitch(SimpleJavaParser.StatementSwitchContext ctx)
    {
        return new StatementSwitch();
    }

    @Override
    public StatementRepeat visitStatementRepeat(SimpleJavaParser.StatementRepeatContext ctx)
    {
        return new StatementRepeat();
    }

}
