package compilator.compilerPart;

import compilator.enums.*;
import compilator.error.*;
import compilator.object.expression.*;
import compilator.object.symbolTable.SymbolTableItem;
import compilator.value.Value;

public class ExpressionCompiler extends BaseCompiler
{
    private final Expression expression;
    private int level;
    private EMethodReturnType methodReturnType;
    private EVariableType resultType;

    public ExpressionCompiler(Expression expression, int level)
    {
        this.expression = expression;
        this.level = level;
    }

    public ExpressionCompiler(Expression expression, EVariableType resultType, int level)
    {
        this.expression = expression;
        this.resultType = resultType;
        this.level = level;
    }

    public ExpressionCompiler(Expression expression, EMethodReturnType methodReturnType, int level)
    {

        this.expression = expression;
        this.methodReturnType = methodReturnType;
        this.level = level;
    }

    public EVariableType runReturnType()
    {
        return this.processExpression(this.expression);
    }

    public void run()
    {
        EVariableType type = this.processExpression(this.expression);

        if (this.resultType != null && type != null)
        {
            if (type != this.resultType)
            {
                this.getErrorHandler().throwError(new ErrorMismatchExpressionResult(this.resultType.toString(), type.toString(), this.expression.getLine()));
            }
        }
        else
        {

        }

    }

    private EVariableType processExpression(Expression expression)
    {
        EVariableType type = null;

        switch (expression.getType())
        {
            case IDENTIFIER:
                type = this.generateIdentifierInstructions((ExpressionIdentifier) expression);
                break;
            case VALUE:
                type = this.generateValueInstructions((ExpressionValue) expression);
                break;
            case MULTIPLICATION:
                type = this.generateMultiplicationInstructions((ExpressionMultiplication) expression);
                break;
            case ADDITIVE:
                type = this.generateAdditiveInstructions((ExpressionAdditive) expression);
                break;
            case RELATIONAL:
                type = this.generateRelationalInstructions((ExpressionRelational) expression);
                break;
            case LOGICAL:
                type = this.generateLogicalInstructions((ExpressionLogical) expression);
                break;
            case NEGATION:
                type = this.generateNegationInstructions((ExpressionNegation) expression);
                break;
            case PAR:
                type = this.generateParInstructions((ExpressionPar) expression);
                break;
            case METHOD_CALL:
                type = this.generateMethodCallInstructions((ExpressionMethodCall) expression);
                break;
        }

        return type;
    }

    private EVariableType generateIdentifierInstructions(ExpressionIdentifier expression)
    {
        String identifier = expression.getValue().toString();

        if (this.isInSymbolTable(identifier))
        {
            SymbolTableItem item = this.getSymbolTable().getItem(identifier);
            this.addInstruction(EInstruction.LOD, this.level - item.getLevel(), item.getAddress());

            return item.getVariableType();
        }
        else
        {
            this.getErrorHandler().throwError(new ErrorVariableNotExists(identifier, expression.getLine()));
        }

        return null;
    }

    private EVariableType generateValueInstructions(ExpressionValue expression)
    {
        Value value = expression.getValue();

        if (expression.getVariableType() == EVariableType.INT)
        {
            this.addInstruction(EInstruction.LIT, 0, value.toInt());
            return EVariableType.INT;
        }
        else if (expression.getVariableType() == EVariableType.BOOLEAN)
        {
            this.addInstruction(EInstruction.LIT, 0, value.toBooleanAsInt());
            return EVariableType.BOOLEAN;
        }

        return null;
    }

    private EVariableType generateMultiplicationInstructions(ExpressionMultiplication expression)
    {
        EVariableType leftExpression = this.processExpression(expression.getLeftExpression());
        EVariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, EVariableType.INT);

        this.addInstruction(EInstruction.OPR, 0, expression.getOperatorCode());

        return  EVariableType.INT;
    }

    private EVariableType generateAdditiveInstructions(ExpressionAdditive expression)
    {
        EVariableType leftExpression = this.processExpression(expression.getLeftExpression());
        EVariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, EVariableType.INT);

        this.addInstruction(EInstruction.OPR, 0, expression.getOperatorCode());

        return  EVariableType.INT;
    }

    private EVariableType generateRelationalInstructions(ExpressionRelational expression)
    {
        EVariableType leftExpression = this.processExpression(expression.getLeftExpression());
        EVariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, EVariableType.INT);

        this.addInstruction(EInstruction.OPR, 0, expression.getOperatorCode());

        return  EVariableType.BOOLEAN;
    }

    private EVariableType generateLogicalInstructions(ExpressionLogical expression)
    {
        EVariableType leftExpression = this.processExpression(expression.getLeftExpression());
        EVariableType rightExpression = this.processExpression(expression.getRightExpression());

        checkVariableTypes(leftExpression, rightExpression, EVariableType.BOOLEAN);
        if (expression.getOperatorLogical() == EOperatorLogical.AND)
        {
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.MULTIPLY.getCode());
            this.addInstruction(EInstruction.LIT, 0, 1);
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.EQ.getCode());
        }
        else
        {
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.PLUS.getCode());
            this.addInstruction(EInstruction.LIT, 0, 0);
            this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.GREATER.getCode());
        }

        return  EVariableType.BOOLEAN;
    }

    private EVariableType generateNegationInstructions(ExpressionNegation expression)
    {
        EVariableType expressionType = this.processExpression(expression.getExpression());

        this.checkVariableType(expressionType, EVariableType.BOOLEAN);

        this.addInstruction(EInstruction.LIT, 0,0);
        this.addInstruction(EInstruction.OPR, 0, EInstructionOperation.EQ.getCode());

        return EVariableType.BOOLEAN;
    }

    private EVariableType generateParInstructions(ExpressionPar expression)
    {
        return this.processExpression(expression.getExpression());
    }

    private EVariableType generateMethodCallInstructions(ExpressionMethodCall expression)
    {
        if (expression.getMethodCall().getExpectedReturnType() == EMethodReturnType.VOID)
        {
            this.getErrorHandler().throwError(new ErrorVoidMethodExpression(expression.getMethodCall().getIdentifier(), expression.getLine()));
        }

        // check if method exists in prototypes
        if (!this.getMethodPrototypes().containsKey(expression.getMethodCall().getIdentifier()))
        {
            this.getErrorHandler().throwError(new ErrorMethodNotExists(expression.getMethodCall().getIdentifier(), expression.getMethodCall().getLine()));
        }

        // set up return type of method call from method prototypes
        expression.getMethodCall().setExpectedReturnType(this.getMethodPrototypes().get(expression.getMethodCall().getIdentifier()).getMethodReturnType());

        new MethodCallCompiler(expression.getMethodCall(), 0).run();

        return this.getMethodPrototype().get(expression.getMethodCall().getIdentifier()).convertReturnTypeToVariableType();
    }

    private void checkVariableTypes(EVariableType type1, EVariableType type2, EVariableType expected)
    {
        if (type1 != expected || type2 != expected)
        {
            this.getErrorHandler().throwError(new ErrorMismatchTypesExpression(expected.toString(), type1.toString(), type2.toString(), this.expression.getLine()));
        }
    }

    private void checkVariableType(EVariableType type, EVariableType expected)
    {
        if (type != expected)
        {
            this.getErrorHandler().throwError(new ErrorMismatchExpressionResult(expected.toString(), type.toString(), this.expression.getLine()));
        }
    }

    public EMethodReturnType getMethodReturnType()
    {
        return methodReturnType;
    }

    public void setMethodReturnType(EMethodReturnType methodReturnType)
    {
        this.methodReturnType = methodReturnType;
    }
}
