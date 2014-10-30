package Adapter;

public class ImplA implements CommonInterface {

	@Override
	public void request() {
		System.out.println("This request is handled by ImplA...");
	}

}
