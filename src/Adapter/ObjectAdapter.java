package Adapter;

public class ObjectAdapter extends ImplBWithDifferentAPI implements CommonInterface  {

	@Override
	public void request() {
		System.out.println("Using Object Adapter...");
		specRequest();
	}
}
