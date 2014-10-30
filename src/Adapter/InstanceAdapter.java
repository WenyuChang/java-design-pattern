package Adapter;

public class InstanceAdapter implements CommonInterface {
	ImplBWithDifferentAPI implB = new ImplBWithDifferentAPI();

	@Override
	public void request() {
		System.out.println("Using Instance Adapter...");
		implB.specRequest();
	}
	
}
