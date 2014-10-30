package Facade;

public class FacadeImpl implements IFacade{
	public void operationInside() {
		InsideClass inside = new InsideClass();
		inside.operation();
	}
}
