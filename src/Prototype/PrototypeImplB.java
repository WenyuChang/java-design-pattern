package Prototype;

public class PrototypeImplB extends Prototype {
	public PrototypeImplB() {
		value = new Object();
	}
	
	public Prototype cloneType() {
		return new PrototypeImplB();
	}
}
