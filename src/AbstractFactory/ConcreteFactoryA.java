package AbstractFactory;

class PA_FactoryA implements IProductA {
	@Override
	public void create() {
		System.out.println("ProductA for FactoryA");
	}
}
class PB_FactoryA implements IProductB {
	@Override
	public void create() {
		System.out.println("ProductB for FactoryA");
	}
}

public class ConcreteFactoryA implements IAbsFactory {

	@Override
	public IProductA createA() {
		IProductA pd_a = new PA_FactoryA();
		pd_a.create();
		return pd_a;
	}

	@Override
	public IProductB createB() {
		IProductB pd_b = new PB_FactoryA();
		pd_b.create();
		return pd_b;
	}

}
