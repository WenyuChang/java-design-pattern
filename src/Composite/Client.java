package Composite;

/**
 * Intent
 * 
 * Compose objects into tree structures to 
 * represent part-whole hierarchies. Composite 
 * lets clients treat individual objects and 
 * compositions of objects uniformly.
 */
public class Client {
	public static void main(String[] args) {
		Component root = new Composite(null);
		root.add(new Leaf(root));
		
		Composite composite = new Composite(root);
		composite.add(new Leaf(composite));
		composite.add(new Leaf(composite));
		
		root.add(composite);
		
		root.operation();
	}
}
