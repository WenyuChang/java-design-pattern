package Strategy;
/**
 *  A concrete strategy to draw a text by the width of line
 */

public class StrategyLowerCase implements IStrategy {
    public StrategyLowerCase() {
    }
    public void operation(String str) {
    	System.out.println(str.toLowerCase());
    }
}