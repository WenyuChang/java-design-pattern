package Visitor;

public class ConcreteElementB implements IElement {
	IVisitor visitor;
	
	@Override
	public void accept(IVisitor visitor) {
		this.visitor = visitor;
	}

	@Override
	public void operation() {
		visitor.VisitConcreteElementB(this);
	}

}
