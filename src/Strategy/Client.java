package Strategy;

/**
 * Intent
 * 
 * Define a family of algorithms, 
 * encapsulate each one, and make them 
 * interchangeable. Strategy lets the 
 * algorithm vary independently from 
 * clients that use it.
 */
public class Client {

	public static void main(String[] args) {
		String str = "This is a test string ! This is a test string !";
        Context myContext = new Context(str);
        
        IStrategy strategyA = new StrategyUpperCase();
        IStrategy strategyB = new StrategyLowerCase();
        myContext.setStrategy(strategyA);
        myContext.handle();

        myContext.setStrategy(strategyB);
        myContext.handle();

	}

}
