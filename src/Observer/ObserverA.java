package Observer;
/**
 *  A concrete observer
 *  This concrete observer can change subject through call
 *  a concrete subject setState function
 */
import java.util.Vector;
 
public class ObserverA implements IObserver {
    private Vector<String> strVector;
    private ISubject sub;
    public ObserverA(ISubject s) {
        sub = s;
    }
    public void update(ISubject subject) {
        strVector = subject.getState();
        System.out.println("----- ObserverA will be updated -----");
        for(int i = 0; i < strVector.size(); i++) {
            System.out.println("Num " + i + " is :" + (String)strVector.get(i));
        }
    }
    public void change(String action, String str) {
        sub.setState(action, str);
    }
    public void notifySub() {
        sub.sendNotify();
    }
}