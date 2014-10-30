package Observer;
/**
 *  Subject interface
 *  In this interface , we can only declare top 3 function, 
 *  other function we can define in an abstract class which implements
 *  this interface
 */
import java.util.*;

public interface ISubject  {
    public abstract void attach(IObserver o);
    public abstract void detach(IObserver o);
    public abstract void sendNotify();

    public abstract Vector<String> getState();
    public abstract void setState(String act, String str);
}