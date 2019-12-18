package compilator.visitor;

import compilator.enums.EVariableType;
import compilator.object.expression.Expression;
import compilator.object.method.MethodCall;
import compilator.object.method.MethodCallParameter;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class MethodCallVisitor extends SimpleJavaBaseVisitor<MethodCall>
{
    private final String METHOD_SYMBOL = "()";

    @Override
    public MethodCall visitMethodCall(SimpleJavaParser.MethodCallContext ctx)
    {
        String identifier = ctx.identifier().getText() + this.METHOD_SYMBOL;
        List<MethodCallParameter> methodCallParameters = this.parseMethodCallParameters(ctx.methodCallParameter());

        return new MethodCall(identifier, methodCallParameters, ctx.start.getLine());
    }

    private List<MethodCallParameter> parseMethodCallParameters(List<SimpleJavaParser.MethodCallParameterContext> methodCallParameterContextsList)
    {
        List<MethodCallParameter> methodCallParameters = new ArrayList<>();
        MethodCallParameter methodCallParameter;

        for (SimpleJavaParser.MethodCallParameterContext parameterContext : methodCallParameterContextsList)
        {
            Expression expression = new ExpressionBodyVisitor().visit(parameterContext.expressionBody());

            methodCallParameter = new MethodCallParameter(expression, null);

            methodCallParameters.add(methodCallParameter);
        }

        return methodCallParameters;
    }


}
