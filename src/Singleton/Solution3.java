package Singleton;

public class Solution3 {
	private static Solution3 instance = null;
	private static Object lock = new Object();
	
	private Solution3() {
		if (instance != null) {
			throw new IllegalStateException("Inside JavaSingleton(): JavaSingleton " + "instance already created.");
		}
	}
	public static Solution3 getInstance() {
		if(instance == null) {
			synchronized(lock) {
				if(instance == null) {
					instance = new Solution3();
				}
			}
		}
		return instance;
	}
}
