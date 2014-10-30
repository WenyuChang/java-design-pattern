package Bridge;

public abstract class AbsImplementor {
	public static AbsImplementor getInstance(String type) {
		if("A".equals(type)) {
			return new ConcreteImplementorA();
		} else if("B".equals(type)) {
			return new ConcreteImplementorB();
		}
		return null;
	}
	
	public abstract void operation();
}
