package compilator.visitor;

import compilator.object.BlockStatement;
import compilator.object.StatementData;
import compilator.object.statement.Statement;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;
import java.util.ArrayList;
import java.util.List;

public class BlockStatementVisitor extends SimpleJavaBaseVisitor<BlockStatement> {

    public BlockStatement visitBlockStatement(SimpleJavaParser.BlockStatementContext ctx)
    {
        List<Statement> statements = getStatements(ctx.statement());

        for (Statement statement: statements) {
            System.out.println(statement.getType());
        }

        return new BlockStatement(new StatementData(statements));
    }

    private List<Statement> getStatements(List<SimpleJavaParser.StatementContext> statementContextList)
    {
        List<Statement> statements = new ArrayList<>();
        Statement statement;

        for (SimpleJavaParser.StatementContext statementContext : statementContextList)
        {
            statement = new StatementVisitor().visit(statementContext);
            statements.add(statement);
        }

        return statements;
    }

}
