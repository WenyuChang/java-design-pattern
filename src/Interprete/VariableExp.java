package Interprete;
/**
 *  A variable expression implements BooleanExp
 *  A terminal expression
 */

public class VariableExp implements IExpression {
    private String name;
    
    public VariableExp(String _name) {
        name = _name;
    }

    public boolean Evaluate(Context c) {
        return c.LookUp(name);
    }
    
}