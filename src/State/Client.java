package State;


/**
 * Intent
 * 
 * Allow an object to alter its 
 * behavior when its internal state 
 * changes. The object will appear to 
 * change its class.
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		while(!context.isFinish()) {
			context.handle();
		}
	}

}
