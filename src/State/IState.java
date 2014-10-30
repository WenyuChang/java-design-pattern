package State;

public interface IState {
	public void handle();
	public IState changeState();
}
