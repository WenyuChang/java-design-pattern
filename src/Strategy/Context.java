package Strategy;
/**
 *  The context user used
 */

public class Context  {
    private IStrategy strategy = null;
    private String str;
    
    public Context(String str) {
    	this.str = str;
    }
    public void setStrategy(IStrategy s) {
        if(s != null) {
            strategy = s;
        }
    }
    
    public void handle() {
    	if(strategy != null) {
    		strategy.operation(str);
    	}
    }
    
}