package compilator.visitor;


import compilator.enums.EMethodReturnType;
import compilator.object.Body;
import compilator.object.control.ControlFor;
import compilator.object.MethodCall;
import compilator.object.Variable;
import compilator.object.expression.Expression;
import compilator.object.statement.*;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

import java.util.HashMap;
import java.util.List;


public class StatementVisitor extends SimpleJavaBaseVisitor<Statement>
{

    @Override
    public StatementIf visitStatementIf(SimpleJavaParser.StatementIfContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        Body bodyIf = new BodyVisitor().visit(ctx.body(0));
        Body bodyElse = null;

        // else part
        if (ctx.body(1) != null)
        {
            bodyElse = new BodyVisitor().visit(ctx.body(1));
        }

        return new StatementIf(expression, bodyIf, bodyElse);
    }

    @Override
    public StatementFor visitStatementFor(SimpleJavaParser.StatementForContext ctx)
    {
        ControlFor controlFor = new ForControlVisitor().visit(ctx.forControl());
        Body body = new BodyVisitor().visit(ctx.body());

        return new StatementFor(controlFor, body);
    }

    @Override
    public StatementWhile visitStatementWhile(SimpleJavaParser.StatementWhileContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        Body body = new BodyVisitor().visit(ctx.body());

        return new StatementWhile(expression, body);
    }

    @Override
    public StatementDo visitStatementDo(SimpleJavaParser.StatementDoContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        Body body = new BodyVisitor().visit(ctx.body());

        return new StatementDo(expression, body);
    }

    @Override
    public StatementSwitch visitStatementSwitch(SimpleJavaParser.StatementSwitchContext ctx)
    {
        List<SimpleJavaParser.SwitchBlockStatementContext> switchBlocks = ctx.switchBlockStatement();
        HashMap<Integer, StatementSwitchBlock> switchBlockHashMap = new HashMap<>();
        StatementSwitchBlock defaultBlock = null;

        for (SimpleJavaParser.SwitchBlockStatementContext switchBlockStatement : switchBlocks)
        {
            // case block
            if (switchBlockStatement.CASE() != null)
            {
                int identifier = Integer.parseInt(switchBlockStatement.DECIMAL().getText());
                Body body = new BodyVisitor().visit(switchBlockStatement.body());
                StatementSwitchBlock stmtSwitchBlock = new StatementSwitchBlock(identifier, body);
                switchBlockHashMap.put(identifier, stmtSwitchBlock);
            }
            // default block
            // TO-DO validation only single default block
            else
            {
                Body body = new BodyVisitor().visit(switchBlockStatement.body());
                defaultBlock = new StatementSwitchBlock(body);
            }
        }

        return new StatementSwitch(switchBlockHashMap, defaultBlock);
    }

    @Override
    public StatementRepeat visitStatementRepeat(SimpleJavaParser.StatementRepeatContext ctx)
    {
        Expression expression = new ExpressionVisitor().visit(ctx.expression());
        Body body = new BodyVisitor().visit(ctx.body());

        return new StatementRepeat(expression, body);
    }

    @Override
    public Statement visitStatementMethodCall(SimpleJavaParser.StatementMethodCallContext ctx)
    {
        MethodCall methodCall = new MethodCallVisitor().visit(ctx.methodCall());
        methodCall.setExpectedReturnType(EMethodReturnType.VOID);

        return new StatementMethodCall(methodCall);
    }

    @Override
    public Statement visitStatementAssigment(SimpleJavaParser.StatementAssigmentContext ctx)
    {
        String identifier = ctx.variableAssigment().identifier().getText();
        Expression expression = new ExpressionBodyVisitor().visit(ctx.variableAssigment().expressionBody());

        return new StatementAssigment(identifier, expression);
    }

    @Override
    public Statement visitStatementVariableDeclaration(SimpleJavaParser.StatementVariableDeclarationContext ctx)
    {
        Variable variable = new VariableVisitor().visit(ctx.variableDeclaration());
        return new StatementDeclaration(variable);
    }


}
