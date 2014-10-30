package Interprete;
/**
 *  A NonterminalExpression
 */
public class OrExpression implements IExpression {
    private IExpression operor1;
    private IExpression operor2;
    
    public OrExpression(IExpression oper1, IExpression oper2) {
        operor1 = oper1;
        operor2 = oper2;
    }

    public boolean Evaluate(Context c) {
        return operor1.Evaluate(c) || operor2.Evaluate(c);
    }
}