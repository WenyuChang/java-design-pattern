package Factory;

class ProductB implements IProduct {

	@Override
	public IProduct create() {
		System.out.println("ProductB has been created...");
		return new ProductB();
	}
}

public class FactoryImplB extends Factory{

	@Override
	public IProduct createProduct() {
		product = new ProductB().create();
		return null;
	}

}
