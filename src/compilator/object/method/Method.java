package compilator.object.method;

import compilator.enums.EMethodReturnType;
import compilator.object.BlockStatement;
import compilator.object.Body;
import compilator.object.expression.Expression;

import java.util.List;

public class Method
{
    private final String identifier;
    private final EMethodReturnType returnType;
    private final List<MethodDeclarationParameter> parameters;
    private final BlockStatement body;
    private final Expression returnValue;
    private int line;

    public Method(EMethodReturnType returnType, String identifier, List<MethodDeclarationParameter> parameters, BlockStatement body, Expression returnValue, int line)
    {
        this.identifier = identifier;
        this.returnType = returnType;
        this.parameters = parameters;
        this.body = body;
        this.returnValue = returnValue;
        this.line = line;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public EMethodReturnType getReturnType()
    {
        return returnType;
    }

    public List<MethodDeclarationParameter> getParameters()
    {
        return parameters;
    }

    public BlockStatement getBody()
    {
        return body;
    }

    public Expression getReturnValue()
    {
        return returnValue;
    }

    @Override
    public String toString()
    {
        return "Method{" +
                "identifier='" + identifier + '\'' +
                ", returnType=" + returnType +
                ", parameters=" + parameters +
                ", body=" + body +
                ", returnValue=" + returnValue +
                '}';
    }

    public int getLine()
    {
        return line;
    }
}
