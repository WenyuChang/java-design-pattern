package Iterator;
/**
 *  Iterator Interface
 */
public interface IIterator {
    public void first();
    public boolean next();
    public boolean isDone();
    public void currentItem();
}