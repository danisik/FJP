package compilator.visitor;

import compilator.object.expression.Expression;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class ExpressionVisitor extends SimpleJavaBaseVisitor<Expression> {

    /**
     * Visitor for Expression()
     * @param ctx Expression context
     * @return
     */
    @Override
    public Expression visitExpression(SimpleJavaParser.ExpressionContext ctx)
    {
        Expression expression = new ExpressionBodyVisitor().visit(ctx.expressionBody());

        return expression;
    }
}
