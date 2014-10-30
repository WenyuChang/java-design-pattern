package Visitor;

/**
 * Intent
 * 
 * Represent an operation to be performed 
 * on the elements of an object structure. 
 * Visitor lets you define a new operation 
 * without changing the classes of the 
 * elements on which it operates.
 */
public class Client {

	public static void main(String[] args) {
		IVisitor visitor1 = new ConcreteVisitor1();
		IVisitor visitor2 = new ConcreteVisitor2();
		
		IElement elementA = new ConcreteElementA();
		elementA.accept(visitor1);
		elementA.operation();
		
		IElement elementB = new ConcreteElementB();
		elementB.accept(visitor1);
		elementB.operation();
		
		System.out.println();
		elementA.accept(visitor2);
		elementA.operation();
		
		elementB.accept(visitor2);
		elementB.operation();
	}

}
