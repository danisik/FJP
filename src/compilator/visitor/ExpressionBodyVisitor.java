package compilator.visitor;

import compilator.enums.EOperatorAdditive;
import compilator.enums.EOperatorLogical;
import compilator.enums.EOperatorMultiplication;
import compilator.enums.EOperatorRelational;
import compilator.object.expression.*;
import compilator.object.method.MethodCall;
import compilator.value.Value;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class ExpressionBodyVisitor extends SimpleJavaBaseVisitor<Expression>
{
    @Override
    public Expression visitExprNeg(SimpleJavaParser.ExprNegContext ctx)
    {
        return new ExpressionNegation(this.visit(ctx.expressionBody()));
    }

    @Override
    public Expression visitExprAdditive(SimpleJavaParser.ExprAdditiveContext ctx)
    {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorAdditive operator = EOperatorAdditive.getSymbol(ctx.op.getText());

        return new ExpressionAdditive(left, right, operator);
    }

    @Override
    public Expression visitExprPar(SimpleJavaParser.ExprParContext ctx)
    {
        return new ExpressionPar(this.visit(ctx.expressionBody()));
    }

    @Override
    public Expression visitExprRelational(SimpleJavaParser.ExprRelationalContext ctx)
    {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorRelational operator = EOperatorRelational.getSymbol(ctx.op.getText());

        return new ExpressionRelational(left, right, operator);
    }

    @Override
    public Expression visitExprIdentifier(SimpleJavaParser.ExprIdentifierContext ctx)
    {
        return new ExpressionIdentifier(new Value(ctx.identifier().getText()));
    }

    @Override
    public Expression visitExprPossibleValue(SimpleJavaParser.ExprPossibleValueContext ctx)
    {
        return new ExpressionValue(new Value(ctx.possibleValues().getText()));
    }

    @Override
    public Expression visitExprLogical(SimpleJavaParser.ExprLogicalContext ctx)
    {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorLogical operator = EOperatorLogical.getSymbol(ctx.op.getText());


        return new ExpressionLogical(left, right, operator);
    }

    @Override
    public Expression visitExprMultipli(SimpleJavaParser.ExprMultipliContext ctx)
    {
        Expression left = this.visit(ctx.expressionBody(0));
        Expression right = this.visit(ctx.expressionBody(1));
        EOperatorMultiplication operator = EOperatorMultiplication.getSymbol(ctx.op.getText());


        return new ExpressionMultiplication(left, right, operator);
    }

    @Override
    public Expression visitExprMethodCall(SimpleJavaParser.ExprMethodCallContext ctx)
    {
        MethodCall methodCall = new MethodCallVisitor().visit(ctx.methodCall());
        return new ExpressionMethodCall(methodCall);
    }


}
