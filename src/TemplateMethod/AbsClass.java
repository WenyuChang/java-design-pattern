package TemplateMethod;

public abstract class AbsClass {
	public void templeteMethod() {
		operation1();
		operation2();
		operation3();
	}
	
	public abstract void operation1();
	public void operation2() {
		System.out.println("Default operation2 is running...");
	}
	public abstract void operation3();
}
