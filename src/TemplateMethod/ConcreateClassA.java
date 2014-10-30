package TemplateMethod;

public class ConcreateClassA extends AbsClass {

	@Override
	public void operation1() {
		System.out.println("In Concreate ClassA. Operation1 is running...");
	}

	@Override
	public void operation3() {
		System.out.println("In Concreate ClassA. Operation3 is running...");
	}

}
