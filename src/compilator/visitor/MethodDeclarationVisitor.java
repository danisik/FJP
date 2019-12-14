package compilator.visitor;

import compilator.enums.EMethodReturnType;
import compilator.enums.EVariableType;
import compilator.object.BlockStatement;
import compilator.object.Body;
import compilator.object.expression.Expression;
import compilator.object.method.Method;
import compilator.object.method.MethodDeclarationParameter;
import generate.SimpleJavaBaseVisitor;
import generate.SimpleJavaParser;

import java.util.ArrayList;
import java.util.List;

public class MethodDeclarationVisitor extends SimpleJavaBaseVisitor<Method>
{
    // added to method identifier, for separate methods from variables at symbol of table
    private final String METHOD_SYMBOL = "()";

    @Override
    public Method visitMethodDeclaration(SimpleJavaParser.MethodDeclarationContext ctx)
    {
        EMethodReturnType returnType = EMethodReturnType.valueOf(ctx.methodReturnType().getText().toUpperCase());
        String identifier = ctx.identifier().getText() + this.METHOD_SYMBOL;
        List<MethodDeclarationParameter> parameters = this.parseMethodParameters(ctx.methodParameter());
        BlockStatement body = new BlockBodyVisitor().visit(ctx.methodBody().blockBody());
        Expression returnValue = new ExpressionBodyVisitor().visit(ctx.methodBody().expressionBody());
        returnValue.setExpectedReturnType(returnType == EMethodReturnType.INT ? EVariableType.INT : EVariableType.BOOLEAN);

        return new Method(returnType, identifier, parameters, body, returnValue);
    }

    private List<MethodDeclarationParameter> parseMethodParameters(List<SimpleJavaParser.MethodParameterContext> methodParameterContext)
    {
        List<MethodDeclarationParameter> methodDeclarationParameters = new ArrayList<>();
        MethodDeclarationParameter methodDeclarationParameter;

        for (SimpleJavaParser.MethodParameterContext method : methodParameterContext)
        {
            EVariableType type = EVariableType.valueOf(method.possibleTypes().getText().toUpperCase());
            String identifier = method.identifier().getText();
            methodDeclarationParameter = new MethodDeclarationParameter(type,identifier);

            methodDeclarationParameters.add(methodDeclarationParameter);
        }

        return methodDeclarationParameters;
    }

}
