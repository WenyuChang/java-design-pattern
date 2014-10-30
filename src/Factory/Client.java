package Factory;


/**
 * Intent
 * 
 * Define an interface for creating an object, 
 * but let subclasses decide which class to 
 * instantiate. Factory Method lets a class 
 * defer instantiation to subclasses.
 */
public class Client {
	private static final String factoryType = "B";
	
	public static void main(String[] args) {
		Factory factory = null;
		if("A".equals(factoryType)) {
			factory = new FactoryImplA();
		} else if("B".equals(factoryType)) {
			factory = new FactoryImplB();
		}
		
		factory.createProduct();
	}
}