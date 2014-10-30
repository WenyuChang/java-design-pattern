package Command;

public class ConcreteOnCommand implements ICommand {
	private Receiver receiver;
    public ConcreteOnCommand(Receiver receiver) {
    	this.receiver = receiver;
    }

	@Override
	public void execute() {
		receiver.turnOn();
	}

}
