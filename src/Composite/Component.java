package Composite;

public abstract class Component {
	Component parent = null;
	
	public abstract void operation();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	
	@Override
	public String toString() {
		if(parent != null) {
			return "And its parent is " + parent.hashCode() + "";
		} else {
			return "It is root, and has no parent.";
		}
	}
}
