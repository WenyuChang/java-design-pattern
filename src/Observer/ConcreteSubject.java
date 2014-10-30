package Observer;
/**
 *  A concrete subject
 */
import java.util.LinkedList;
import java.util.Vector;

public class ConcreteSubject implements ISubject {
    private LinkedList<IObserver> observerList;
    private Vector<String> strVector;
    
    public ConcreteSubject() {
        observerList =  new LinkedList<IObserver>();
        strVector = new Vector<String>();
    }
    public void attach(IObserver o) {
        observerList.add(o);
    }
    public void detach(IObserver o) {
        observerList.remove(o);
    }
    public void sendNotify() {
        for(int i = 0; i < observerList.size(); i++) {
            (observerList.get(i)).update(this);   
        }
    }
    public void setState(String act, String str) {
        if(act.equals("ADD")) {
            strVector.add(str);
        } else if(act.equals("DEL")) {
            strVector.remove(str);
        }
    }
    public Vector<String> getState() {
        return strVector;
    }
}