package compilator.visitor;

import compilator.object.expression.Expression;
import compilator.object.method.MethodCall;
import compilator.object.method.MethodCallParameter;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class MethodCallVisitor extends SimpleJavaBaseVisitor<MethodCall>
{
    @Override
    public MethodCall visitMethodCall(SimpleJavaParser.MethodCallContext ctx)
    {
        String identifier = ctx.identifier().getText();
        List<MethodCallParameter> methodCallParameters = this.parseMethodCallParameters(ctx.methodCallParameter());

        return new MethodCall(identifier, methodCallParameters);
    }

    private List<MethodCallParameter> parseMethodCallParameters(List<SimpleJavaParser.MethodCallParameterContext> methodCallParameterContextsList)
    {
        List<MethodCallParameter> methodCallParameters = new ArrayList<>();
        MethodCallParameter methodCallParameter;

        for (SimpleJavaParser.MethodCallParameterContext parameterContext : methodCallParameterContextsList)
        {
            Expression expression = new ExpressionVisitor().visit(parameterContext.expressionBody());
            methodCallParameter = new MethodCallParameter(expression);

            methodCallParameters.add(methodCallParameter);
        }

        return methodCallParameters;
    }


}
