package State;

public class ConcreteStateProc implements IState {
	
	@Override
	public void handle() {
		System.out.println("Current State is Proc. And I am handled...");
	}

	@Override
	public IState changeState() {
		return new ConcreteStateFinish();
	}

}
