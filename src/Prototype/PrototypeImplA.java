package Prototype;

public class PrototypeImplA extends Prototype {
	public PrototypeImplA() {
		value = new Object();
	}
	
	public Prototype cloneType() {
		return this;
	}
}
