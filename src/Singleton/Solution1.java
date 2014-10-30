package Singleton;

public class Solution1 {
	private static Solution1 instance = null;
	
	private Solution1() {}
	public static Solution1 getInstance() {
		if(instance == null) {
			instance  = new Solution1();
		}
		return instance;
	}
}
