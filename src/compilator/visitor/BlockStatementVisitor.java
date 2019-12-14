package compilator.visitor;

import compilator.object.BlockStatement;
import compilator.object.StatementData;
import compilator.object.method.Method;
import compilator.object.statement.Statement;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;
import java.util.ArrayList;
import java.util.List;

public class BlockStatementVisitor extends SimpleJavaBaseVisitor<BlockStatement> {

    public BlockStatement visitBlockStatement(SimpleJavaParser.BlockStatementContext ctx)
    {
        System.out.println("a");
        List<Statement> statements = this.getStatements(ctx.statement());
        List<Method> methods = this.getMethods(ctx.methodDeclaration());
        System.out.println("---------Statementy-----------");

        for (Statement statement: statements) {
            System.out.println(statement.getType());
        }

        System.out.println("--------Metody------------");
        for (Method method : methods)
        {
            System.out.println(method);
            for (Statement statement: method.getBody().getStatementData().getStatements()) {
                System.out.println(statement.getType());
            }
        }
        System.out.println("--------------------");

        return new BlockStatement(new StatementData(statements), methods);
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

    private List<Method> getMethods(List<SimpleJavaParser.MethodDeclarationContext> methodDeclarationContextList)
    {
        List<Method> methods = new ArrayList<>();
        Method method;

        for (SimpleJavaParser.MethodDeclarationContext methodDeclarationContext : methodDeclarationContextList)
        {
            method = new MethodDeclarationVisitor().visit(methodDeclarationContext);
            methods.add(method);
        }

        return methods;
    }

}
