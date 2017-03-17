package Singleton;

public class Solution4 {
	private static final Solution4 instance = new Solution4();
	
	int value = 1;
	private Solution4() {
		if (instance != null) {
			throw new IllegalStateException("Inside JavaSingleton(): JavaSingleton " + "instance already created.");
		}
	}
	public static Solution4 getInstance() {
		return instance;
	}
	
	public void print() {
		System.out.println(value);
		value++;
	}
}
