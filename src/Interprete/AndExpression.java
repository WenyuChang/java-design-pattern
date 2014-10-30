package Interprete;
/**
 *  A NonterminalExpression
 */
public class AndExpression implements IExpression {
    private IExpression operand1;
    private IExpression operand2;
    
    public AndExpression(IExpression oper1, IExpression oper2) {
        operand1 = oper1;
        operand2 = oper2;
    }

    public boolean Evaluate(Context c) {
        return operand1.Evaluate(c) && operand2.Evaluate(c);
    }
}