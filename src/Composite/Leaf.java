package Composite;

public class Leaf extends Component {
	
	public Leaf(Component parent) {
		this.parent = parent;
	}
	
	public void operation() {
		System.out.println("This is a leaf operation... " + toString());
	}

	public void add(Component component) {
		System.out.println("This is an leaf. It cannot add another component...");
	}

	public void remove(Component component) {
		System.out.println("This is an leaf. It cannot remove another component...");
	}
}
