package TemplateMethod;

/**
 * Intent
 * 
 * Define the skeleton of an algorithm 
 * in an operation, deferring some steps 
 * to subclasses. Template Method lets 
 * subclasses redefine certain steps of 
 * an algorithm without changing the 
 * algorithm's structure.
 */
public class Client {

	public static void main(String[] args) {
		AbsClass clz = new ConcreateClassA();
		clz.templeteMethod();
		
		System.out.println();
		clz = new ConcreateClassB();
		clz.templeteMethod();
	}

}
