package Interprete;
/**
 *  A NonterminalExpression
 */
public class NotExpression implements IExpression {
    private IExpression opernot1;
    
    public NotExpression(IExpression oper1) {
        opernot1 = oper1;
    }

    public boolean Evaluate(Context c) {
        return !(opernot1.Evaluate(c));
    }
}