package Facade;

class SubClassA {
	public void operation() {
		System.out.println("Sub-Class A is operated...");
	}
}

class SubClassB {
	public void operation() {
		System.out.println("Sub-Class B is operated...");
	}
}

class SubClassC {
	public void operation() {
		System.out.println("Sub-Class C is operated...");
	}
}

public class InsideClass {
	public void operation() {
		SubClassA clzA = new SubClassA();
		clzA.operation();
		
		SubClassB clzB = new SubClassB();
		clzB.operation();
		
		SubClassC clzC = new SubClassC();
		clzC.operation();
	}
	
}
