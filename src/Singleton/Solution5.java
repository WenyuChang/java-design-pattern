package Singleton;

public class Solution5 {
	
	private Solution5() {}
	public static Solution5 getInstance() {
		return Builder.getSolution5();
	}
	
	private static class Builder {
		private static Solution5 instance = new Solution5();
		
		private Builder() {}
		private static Solution5 getSolution5() {
			return instance;
		}
	}
}
