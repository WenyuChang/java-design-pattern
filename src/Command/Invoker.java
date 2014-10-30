package Command;

public class Invoker {
	private ICommand onCommand;
	private ICommand offCommand;
    public Invoker (ICommand on, ICommand off) {
    	onCommand = on;
    	offCommand = off;
    }
    void cmdOn() {
    	onCommand.execute();
    }
    void cmdOff() {
    	offCommand.execute();
    }
}
