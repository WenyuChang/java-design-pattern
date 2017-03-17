package Singleton.safest;

import java.io.ObjectStreamException;

public class Solution7 {
	private static final Solution7 instance = new Solution7();
	
	int value = 1;
	private Solution7() {
		/*
		 * To escape for reflective instantion, we can add check in the constructor and throw exception.
		 */
		if (instance != null) {
			throw new IllegalStateException("Inside JavaSolution4(): JavaSolution4 " + "instance already created.");
		}
	}
	public static Solution7 getInstance() {
		return instance;
	}
	
	public void print() {
		System.out.println(value);
		value++;
	}

	/*
	 * To prevent deserializing to create new object you may override 
	 * readResolve() method in your class and throw exception
	 */
    private Object readResolve() throws ObjectStreamException         {
            return instance;
    }
    private Object writeReplace() throws ObjectStreamException {
            return instance;
    }
    
    /*
     * To prevent cloning, you may overrride clone() and throw CloneNotSupported exception
     */
    public Object clone() throws CloneNotSupportedException {
        // return instance
        throw new CloneNotSupportedException();
    }
}
