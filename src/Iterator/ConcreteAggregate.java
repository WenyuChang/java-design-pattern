package Iterator;

import java.util.Vector;

public class ConcreteAggregate implements IAggregate {
    private Vector<Integer> data = new Vector<Integer>();
    
    public ConcreteAggregate() {
        for(int i=0;i<10;i++) {
        	data.add(i);
        }
    }
    
    public IIterator CreateIterator() {
        return new ConcreteIterator(data);
    }
    
}