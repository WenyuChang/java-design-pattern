package Facade;

/**
 * Intent
 * 
 * Provide a unified interface to a set of 
 * interfaces in a subsystem. Facade defines 
 * a higher-level interface that makes the 
 * subsystem easier to use.
 */
public class Client {
	public static void main(String[] args) {
		IFacade facade = new FacadeImpl();
		facade.operationInside();
	}
}
