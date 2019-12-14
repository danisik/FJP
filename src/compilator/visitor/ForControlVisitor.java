package compilator.visitor;

import compilator.enums.EVariableType;
import compilator.object.control.ControlFor;
import compilator.object.expression.Expression;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

public class ForControlVisitor extends SimpleJavaBaseVisitor<ControlFor>
{
    @Override
    public ControlFor visitForControl(SimpleJavaParser.ForControlContext ctx)
    {
        String identifier = ctx.identifier().getText();
        Expression from = new ExpressionBodyVisitor().visit(ctx.expressionBody(0));
        from.setExpectedReturnType(EVariableType.INT);
        Expression to = new ExpressionBodyVisitor().visit(ctx.expressionBody(1));
        to.setExpectedReturnType(EVariableType.INT);


        return new ControlFor(identifier, from, to);
    }
}
