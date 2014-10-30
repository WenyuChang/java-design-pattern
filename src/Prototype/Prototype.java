package Prototype;

public abstract class Prototype {
	protected Object value = null;
	public abstract Prototype cloneType();
	public String toString() {
		return "Value's hash code is: " + value.hashCode();
	}
}
