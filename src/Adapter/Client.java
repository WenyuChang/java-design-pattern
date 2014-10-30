package Adapter;

/**
 * Intent
 * 
 * Convert the interface of a class into another 
 * interface clients expect. Adapter lets classes 
 * work together that couldn't otherwise because 
 * of incompatible interfaces.
 */
public class Client {

	public static void main(String[] args) {
		// Normal use, implA has the same API as in the interface
		CommonInterface implA = new ImplA();
		implA.request();

		// Since implB has different API as in the interface,
		// It need an adapter to make client unware of this difference
		//
		// There are two ways: object adapter and instance object
		CommonInterface impB_obj = new ObjectAdapter();
		impB_obj.request();
		
		CommonInterface impB_ins = new InstanceAdapter();
		impB_ins.request();
	}

}
