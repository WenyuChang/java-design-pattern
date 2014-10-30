package FlyWeight;

import java.util.Hashtable;

public class FlyWeightFactory {
	private Hashtable<String, IFlyWeight> flyweights = new Hashtable<String, IFlyWeight>();

	public synchronized IFlyWeight getFlyweight(String key) {
		IFlyWeight flyWeight = flyweights.get(key);
		if(flyWeight == null) {
			if("A".equals(key)) {
				flyWeight = new ConcreteFlyWeightA();
			} else if("B".equals(key)) {
				flyWeight = new ConcreteFlyWeightB();
			} else {
				flyWeight = new UnsharedConcreteFlyweight();
			}
			flyweights.put(key, flyWeight);
		}
		
		return flyWeight;
	}
} 