package FlyWeight;

public class UnsharedConcreteFlyweight implements IFlyWeight {

	@Override
	public void operation() {
		System.out.println("This instance is unshared and its hashcode is " + hashCode());
	}

}
