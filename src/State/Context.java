package State;
/**
 *  The context for user useing
 */
public class Context  {
    private IState currentState;
    public Context() {
    	currentState = new ConcreteStateInit();
    }

    public boolean isFinish() {
    	return (currentState == null);
    }
    
    public void handle() {
    	currentState.handle();
    	currentState = currentState.changeState();
    }
}