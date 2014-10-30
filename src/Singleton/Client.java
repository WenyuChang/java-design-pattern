package Singleton;

/**
 * Intent
 * 
 * Ensure a class only has one instance, 
 * and provide a global point of access to it.
 */
public class Client {

	public static void main(String[] args) {
		// Workable Only in Single-Threading Applications
		//Solution1 ins1 = Solution1.getInstance();
		
		// Works with Multiple Threads but Is Inefficient
		//Solution2 ins2 = Solution2.getInstance();
		
		// Double-Check around Locking, much more efficient than solution2
		//Solution3 ins3 = Solution3.getInstance();
		
		// Utilization of Static Constructors, but create an instance too early, and it impairs the space efficiency
		Solution4 ins4 = Solution4.getInstance();
		ins4.print();
		
		// Almost best solution, creating an instance When Necessary
		//Solution5 ins5 = Solution5.getInstance();
		
		// Best solution, but not popular
		//Solution6 ins6 = Solution6.INSTANCE;
	}

}
