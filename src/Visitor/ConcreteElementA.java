package Visitor;

public class ConcreteElementA implements IElement {
	IVisitor visitor;
	
	@Override
	public void accept(IVisitor visitor) {
		this.visitor = visitor;
	}

	@Override
	public void operation() {
		visitor.VisitConcreteElementA(this);
	}

}
