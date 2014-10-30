package Visitor;

public interface IElement {
	public void accept(IVisitor visitor);
	public void operation();
}
