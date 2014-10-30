package AbstractFactory;

class PA_FactoryB implements IProductA {
	@Override
	public void create() {
		System.out.println("ProductA for FactoryB");
	}
}
class PB_FactoryB implements IProductB {
	@Override
	public void create() {
		System.out.println("ProductB for FactoryB");
	}
}

public class ConcreteFactoryB implements IAbsFactory {

	@Override
	public IProductA createA() {
		IProductA pd_a = new PA_FactoryB();
		pd_a.create();
		return pd_a;
	}

	@Override
	public IProductB createB() {
		IProductB pd_b = new PB_FactoryB();
		pd_b.create();
		return pd_b;
	}

}
