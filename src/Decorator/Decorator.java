package Decorator;

public abstract class Decorator implements IComponent {
	public IComponent component = null;
	
	public Decorator(IComponent component) {
		this.component = component;
	}
	
	public abstract void decoratorDesc();
}
