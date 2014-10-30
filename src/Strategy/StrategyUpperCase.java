package Strategy;
/**
 *  A concrete strategy to draw a text by the width of line
 */

public class StrategyUpperCase implements IStrategy {
    public StrategyUpperCase() {
    }
    public void operation(String str) {
    	System.out.println(str.toUpperCase());
    }
}