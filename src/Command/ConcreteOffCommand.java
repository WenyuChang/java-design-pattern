package Command;

public class ConcreteOffCommand implements ICommand {
	private Receiver receiver;
    public ConcreteOffCommand(Receiver receiver) {
    	this.receiver = receiver;
    }

	@Override
	public void execute() {
		receiver.turnOff();
	}

}
