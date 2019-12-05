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
    public BlockStatement visitBlockBody(SimpleJavaParser.BlockBodyContext ctx)
    {
        List<Statement> statements = this.getStatements(ctx.statement());

        System.out.println("---------Body-----------" + ctx.getParent().getParent().getText());


        for (Statement statement: statements) {
            System.out.println(statement.getType());
        }
        System.out.println("--------------------");

        return new BlockStatement(new StatementData(statements), null);
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
