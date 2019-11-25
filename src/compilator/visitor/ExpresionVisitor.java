package compilator.visitor;

import compilator.object.expression.Expression;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class ExpresionVisitor extends SimpleJavaBaseVisitor<Expression> {
    @Override
    public Expression visitExpression(SimpleJavaParser.ExpressionContext ctx)
    {
        Expression expression =  new ExpressionBodyVisitor().visit(ctx.expressionBody());

        return  expression;
    }
}
