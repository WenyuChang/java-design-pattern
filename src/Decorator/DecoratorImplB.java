package Decorator;

public class DecoratorImplB extends Decorator {
	public DecoratorImplB(IComponent component) {
		super(component);
	}

	public void operation() {
		decoratorDesc();
		System.out.println("This is a decorated concrete component. Its hashcode is " + component.hashCode());
	}
	
	public void decoratorDesc() {
		System.out.println("This is a concrete decorator, named DecoratorImplB");
	}
}
