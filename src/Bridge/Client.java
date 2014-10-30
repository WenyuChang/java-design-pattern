package Bridge;

/**
 * Intent
 *
 * Decouple an abstraction from its 
 * implementation so that the two 
 * can vary independently.
 */
public class Client {
	private static final String type = "B";
	public AbsImplementor impl;
	
	public void initialize(String type) {
		if(impl == null) {
			impl = AbsImplementor.getInstance(type);
		}
	}
	
	public void invoke() {
		impl.operation();
	}
	
	public static void main(String[] args) {
		Client invoker = new Client();
		invoker.initialize(type);
		invoker.invoke();
	}
}
