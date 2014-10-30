package Prototype;


/**
 * Intent
 * 
 * Specify the kinds of objects to create 
 * using a prototypical instance, and create 
 * new objects by copying this prototype.
 */
public class Client {
	private static final String type = "B";
	
	private static void register() {
		PrototypeManager manager = PrototypeManager.getInstance();
		
		Prototype implA = new PrototypeImplA();
		manager.register("ImplA", implA);
		
		Prototype implB = new PrototypeImplB();
		manager.register("ImplB", implB);
	}
	
	public static void main(String[] args) {
		register();

		// Get manager instance and list all the registered protoptype's hashcode
		PrototypeManager manager = PrototypeManager.getInstance();
		manager.listMaps();
		
		Prototype prototype = null;
		if("A".equals(type)) {
			// Type A only return itself, which means the hash code is the same as in the manager.
			prototype = manager.retrieve("ImplA");
		} else if("B".equals(type)) {
			// Type B is deep clone, which means the hash code is different with the one in the manager.
			prototype = manager.retrieve("ImplB");
		}
		
		System.out.println(prototype.toString());
	}
}
