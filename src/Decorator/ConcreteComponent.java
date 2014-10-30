package Decorator;

public class ConcreteComponent implements IComponent {

	@Override
	public void operation() {
		System.out.println("This is a raw concrete component. Its hashcode is " + hashCode());
	}

}
