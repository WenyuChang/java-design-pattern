package Interprete;

/**
 * Intent
 * 
 * Given a language, define a represention 
 * for its grammar along with an interpreter 
 * that uses the representation to interpret 
 * sentences in the language.
 */
public class Client {

	// Test : (a and b) or (c or !d)
	public static void main(String[] args) {
		VariableExp a = new VariableExp("A");
        VariableExp b = new VariableExp("B");
        VariableExp c = new VariableExp("C");
        VariableExp d = new VariableExp("D");
		
		Context context = new Context();
		context.Assign("A", true);
        context.Assign("B", false);
        context.Assign("C", false);
        context.Assign("D", false);
        
        IExpression expression = new OrExpression(new AndExpression(a, b), new OrExpression(c, new NotExpression(d)));
        boolean result = expression.Evaluate(context);
        System.out.println("The result is:" + result);
	}
}
