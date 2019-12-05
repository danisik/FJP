package compilator.visitor;

import compilator.object.BlockStatement;
import compilator.object.Variable;
import compilator.object.statement.Statement;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BlockStatementVisitor extends SimpleJavaBaseVisitor<BlockStatement> {

    public BlockStatement visitBlockStatement(SimpleJavaParser.BlockStatementContext ctx)
    {
        List<Statement> statements = getStatements(ctx.statement());

        for (Statement statement: statements) {
            System.out.println(statement.getType());
        }

        return new BlockStatement();
    }
/*
    private HashMap<String, Variable> getVariables(List<SimpleJavaParser.VariableDeclarationContext> variableDeclarationContextList)
    {
        HashMap<String, Variable> variables = new HashMap<>();
        Variable variable;


        for (SimpleJavaParser.VariableDeclarationContext variableDeclarationContext : variableDeclarationContextList)
        {
            variable = new VariableVisitor().visit(variableDeclarationContext);

            variables.put(variable.getName(), variable);

            if (variable.existsParallel()) {
                for (String name : variable.getParallelArray()) {
                    variables.put(name, new Variable(name, variable.getValue(), variable.getType(), variable.isConstant()));
                }
            }
        }

        return  variables;
    }
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
