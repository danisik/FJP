package compilator.visitor;

import compilator.object.BlockStatement;
import compilator.object.StatementData;
import compilator.object.statement.Statement;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class BlockBodyVisitor extends SimpleJavaBaseVisitor<BlockStatement>
{
    /**
     * Visitor for BlockBody
     * @param ctx blockBody context
     * @return internal structure BlockStatement
     */
    public BlockStatement visitBlockBody(SimpleJavaParser.BlockBodyContext ctx)
    {
        if (ctx == null)
        {
            return null;
        }

        List<Statement> statements = this.getStatements(ctx.statement());

        return new BlockStatement(new StatementData(statements), null);
    }

    /**
     * Processes all statements in blockBody();
     * @param statementContextList list of statements
     * @return internal list of statements
     */
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
