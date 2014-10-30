package Proxy;

class SubjectProxy implements ISubject {
	ISubject subject;

	public SubjectProxy() {
		subject = new ConcreteSubject();
	}

	public void operation() {
		System.out.println("Proxy is trying to call subject's operation...");
		subject.operation();
	}
}
