package Proxy;

/**
 * Intent
 * 
 * Provide a surrogate or placeholder 
 * for another object to control access to it.
 */
public class Client {

	public static void main(String[] args) {
		SubjectProxy proxy = new SubjectProxy();
		proxy.operation();
	}

}
