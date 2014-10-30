package FlyWeight;

public class ConcreteFlyWeightB implements IFlyWeight {
	private String intrinsicState = "B"; 
	
	@Override
	public void operation() {
		System.out.println("This instance is " + hashCode() + ". And is instrinsic state is " + intrinsicState);
	}

}
