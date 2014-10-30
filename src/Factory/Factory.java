package Factory;

public abstract class Factory {
	protected IProduct product = null;
	public abstract IProduct createProduct();
	
	public IProduct getProduct() {
		createProduct();
		return product;
	}
}
