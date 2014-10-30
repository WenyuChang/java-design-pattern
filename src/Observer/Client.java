package Observer;

/**
 * Intent
 * 
 * Define a one-to-many dependency between 
 * objects so that when one object changes 
 * state, all its dependents are notified 
 * and updated automatically.
 */
public class Client {

	public static void main(String[] args) {
        ISubject mySub = new ConcreteSubject();
        ObserverA myObserverA = new ObserverA(mySub);
        ObserverB myObserverB = new ObserverB();
        mySub.attach(myObserverA);
        mySub.attach(myObserverB);

        mySub.setState("ADD", "One --- 1");
        mySub.setState("ADD", "Tow --- 2");
        mySub.sendNotify();

        myObserverA.change("DEL", "Tow --- 2");
        myObserverA.change("ADD", "Three --- 3");
        myObserverA.change("ADD", "Four --- 4");
        myObserverA.notifySub(); 
	}

}
