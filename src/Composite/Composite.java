package Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Composite extends Component {
	List<Component> components = new ArrayList<Component>();
	
	public Composite(Component parent) {
		this.parent = parent;
	}
	
	public void operation() {
		System.out.println("This is a composite operation (" + this.hashCode() + ")... " + toString());
		Component component = null;
		Iterator<Component> it = components.iterator();
		while (it.hasNext()) {
			component = (Component) it.next();
			component.operation();
		}
	}

	public void add(Component component) {
		components.add(component);
	}

	public void remove(Component component) {
		components.remove(component);
	}
}
