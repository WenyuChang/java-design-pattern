package Iterator;
/**
 *  A vector iterator to print data reverse
 */
import java.util.Vector;

public class ConcreteIterator implements IIterator {
    private Vector<Integer> data = new Vector<Integer>();
    private int cursor = 0;

    public ConcreteIterator(Vector<Integer> data) {
        this.data = data;
    }    
    public void first() {
        cursor = (data.size() - 1);
    }
    public boolean next() {
        return (--cursor >= 0);
    }
    public boolean isDone() {
        return (cursor < 0);
    }
    public void currentItem() {
        if(isDone()) {
            System.out.println("Reach the end of the vector");
        } else {
            System.out.println("Number " + cursor + ": " + data.get(cursor));
        }
    }
}