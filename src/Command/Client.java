package Command;

/**
 * Intent
 * 
 * Encapsulate a request as an object, 
 * thereby letting you parameterize clients 
 * with different requests, queue or log 
 * requests, and support undoable operations.
 */
public class Client {

	public static Invoker initialize() {
		Receiver reciever = new Receiver();
		ConcreteOffCommand off = new ConcreteOffCommand(reciever);
		ConcreteOnCommand on = new ConcreteOnCommand(reciever);
		
		Invoker invoke = new Invoker(on, off);
		return invoke;
	}
	
	public static void main(String[] args) {
		Invoker invoker = initialize();

		invoker.cmdOn();
		invoker.cmdOff();
	}

}
