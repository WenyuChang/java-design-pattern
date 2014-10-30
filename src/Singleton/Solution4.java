package Singleton;

public class Solution4 {
	private static final Solution4 instance = new Solution4();
	
	int value = 1;
	private Solution4() {}
	public static Solution4 getInstance() {
		return instance;
	}
	
	public void print() {
		System.out.println(value);
		value++;
	}
}
