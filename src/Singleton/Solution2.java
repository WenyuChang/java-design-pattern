package Singleton;

public class Solution2 {
	private static Solution2 instance = null;
	private static Object lock = new Object();
	
	private Solution2() {
		if (instance != null) {
			throw new IllegalStateException("Inside JavaSingleton(): JavaSingleton " + "instance already created.");
		}
	}
	public static Solution2 getInstance() {
		synchronized(lock) {
			if(instance == null) {
				instance = new Solution2();
			}
		}
		return instance;
	}
}
