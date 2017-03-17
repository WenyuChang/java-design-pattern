package Singleton;

public class Solution1 {
	private static Solution1 instance = null;

	private Solution1() {
		if (instance != null) {
			throw new IllegalStateException("Inside JavaSingleton(): JavaSingleton " + "instance already created.");
		}
	}

	public static Solution1 getInstance() {
		if (instance == null) {
			instance = new Solution1();
		}
		return instance;
	}
}
