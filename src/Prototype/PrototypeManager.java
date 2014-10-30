package Prototype;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class PrototypeManager {
	private Map<String, Prototype> map = new HashMap<String, Prototype>();
	private static final PrototypeManager manager = new PrototypeManager();
	
	public static PrototypeManager getInstance() {
		return manager;
	}
	
	
	public void listMaps() {
		Iterator<Entry<String, Prototype>> it = map.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry<String, Prototype> pairs = (Map.Entry<String, Prototype>) it.next();
	        System.out.println(pairs.getKey() + " = " + pairs.getValue().toString());
	    }
	}
	
	public void register(String name, Prototype type) {
		if(!map.containsKey(name)) {
			map.put(name, type);
		} else {
			System.out.println(name + " is already exists...");
		}
	}
	
	public Prototype retrieve(String name) {
		if(map.containsKey(name)) {
			System.out.println("Return " + name + "'s clone...");
			return map.get(name).cloneType();
		} else {
			System.out.println(name + " doesn't exists...");
			return null;
		}
	}
}
