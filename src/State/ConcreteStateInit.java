package State;

public class ConcreteStateInit implements IState {

	@Override
	public void handle() {
		System.out.println("Current State is Init. And I am handled...");
	}

	@Override
	public IState changeState() {
		return new ConcreteStateProc();
	}

}
