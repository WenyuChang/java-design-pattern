package AbstractFactory; 
/**
 * Intent
 *
 * Provide an interface for creating families of related or dependent
 * objects without specifying their concrete classes.
 */
public class Client {
	private static final String factoryType = "B";
	
	public static void main(String[] args) {
		IAbsFactory factory = null;
		if("A".equals(factoryType)) {
			factory = new ConcreteFactoryA();
		} else if("B".equals(factoryType)) {
			factory = new ConcreteFactoryB();
		}
		
		factory.createA();
		factory.createB();
	}
}
