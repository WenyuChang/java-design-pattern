package Iterator;

/**
 * Intent
 * 
 * Provide a way to access the elements 
 * of an aggregate object sequentially 
 * without exposing its underlying representation.
 */
public class Client {

	public static void main(String[] args) {
		IAggregate aggData = new ConcreteAggregate();
        IIterator iterator = aggData.CreateIterator();
        iterator.first();
        
        do {
        	iterator.currentItem();
        } while(iterator.next());

	}

}
