package FlyWeight;

public class ConcreteFlyWeightA implements IFlyWeight {
	private String intrinsicState = "A"; 
	
	@Override
	public void operation() {
		System.out.println("This instance is " + hashCode() + ". And is instrinsic state is " + intrinsicState);
	}

}
