package Decorator;

public class DecoratorImplA extends Decorator {
	public DecoratorImplA(IComponent component) {
		super(component);
	}

	public void operation() {
		decoratorDesc();
		System.out.println("This is a decorated concrete component. Its hashcode is " + component.hashCode());
	}
	
	public void decoratorDesc() {
		System.out.println("This is a concrete decorator, named DecoratorImplA");
	}
}
