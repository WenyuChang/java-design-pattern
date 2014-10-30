package Factory;

class ProductA implements IProduct {

	@Override
	public IProduct create() {
		System.out.println("ProductA has been created...");
		return new ProductA();
	}
}

public class FactoryImplA extends Factory{

	@Override
	public IProduct createProduct() {
		product = new ProductA().create();
		return null;
	}

}
