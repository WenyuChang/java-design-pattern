package Decorator;

/**
 * Intent
 * 
 * Attach additional responsibilities to an object dynamically. 
 * Decorators provide a flexible alternative to subclassing 
 * for extending functionality.
 */
public class Client {
	
	public static void main(String[] args) {
		IComponent rawComponent = new ConcreteComponent();
		rawComponent.operation();
		
		IComponent decoratedComponentA = new DecoratorImplA(rawComponent);
		decoratedComponentA.operation();
		
		IComponent decoratedComponentB = new DecoratorImplB(decoratedComponentA);
		decoratedComponentB.operation();
	}
}
