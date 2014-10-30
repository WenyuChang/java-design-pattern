package State;

public class ConcreteStateFinish implements IState {

	@Override
	public void handle() {
		System.out.println("Current State is Init. And I am handled...");
	}

	@Override
	public IState changeState() {
		return null;
	}

}
