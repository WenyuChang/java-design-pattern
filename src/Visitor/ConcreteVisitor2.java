package Visitor;

public class ConcreteVisitor2 implements IVisitor {

	@Override
	public void VisitConcreteElementA(IElement concreteElementA) {
		System.out.println(concreteElementA.hashCode() + "is visited by " + hashCode());
	}

	@Override
	public void VisitConcreteElementB(IElement concreteElementB) {
		System.out.println(concreteElementB.hashCode() + "is visited by " + hashCode());
	}

}
