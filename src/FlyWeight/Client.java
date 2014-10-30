package FlyWeight;

/**
 * Intent
 * 
 * Use sharing to support large numbers 
 * of fine-grained objects efficiently.
 */
public class Client {

	public static void main(String[] args) {
		FlyWeightFactory factory = new FlyWeightFactory();
		IFlyWeight flyWeight = factory.getFlyweight("A");
		flyWeight.operation();
		
		flyWeight = factory.getFlyweight("A");
		flyWeight.operation();
		
		flyWeight = factory.getFlyweight("B");
		flyWeight.operation();
		
		flyWeight = factory.getFlyweight("C");
		flyWeight.operation();
	}

}
