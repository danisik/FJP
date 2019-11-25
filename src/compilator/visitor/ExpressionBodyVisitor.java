package compilator.visitor;

import compilator.object.expression.*;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class ExpressionBodyVisitor extends SimpleJavaBaseVisitor<Expression> {
    @Override
    public Expression visitExprNeg(SimpleJavaParser.ExprNegContext ctx)
    {
        return new ExpressionNegation();
    }

    @Override
    public Expression visitExprAdditive(SimpleJavaParser.ExprAdditiveContext ctx)
    {
        return new ExpressionAdditive();
    }

    @Override
    public Expression visitExprPar(SimpleJavaParser.ExprParContext ctx)
    {
        return new ExpressionPar();
    }

    @Override
    public Expression visitExprRelational(SimpleJavaParser.ExprRelationalContext ctx)
    {
        return new ExpressionRelational();
    }

    @Override
    public Expression visitExprIdentifier(SimpleJavaParser.ExprIdentifierContext ctx)
    {
        return new ExpressionIdentifier();
    }

    @Override
    public Expression visitExprPossibleValue(SimpleJavaParser.ExprPossibleValueContext ctx)
    {
        return new ExpressionValue();
    }

    @Override
    public Expression visitExprLogical(SimpleJavaParser.ExprLogicalContext ctx)
    {
        return new ExpressionLogical();
    }

    @Override
    public Expression visitExprMultipli(SimpleJavaParser.ExprMultipliContext ctx)
    {
        return new ExpressionMultiplication();
    }

}
