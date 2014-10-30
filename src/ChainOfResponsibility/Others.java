package ChainOfResponsibility;
/**
 *  The end of the chain
 *  The resposibility of Others is handle exeception 
 */

public class Others implements IChain {
    private IChain nextChain = null;
    private String responsibility = "None";
    
    public Others() {
    }
    public void addChain(IChain c) {
        nextChain = c;
    }
    
    public IChain getChain() {
        return nextChain;
    }
    
    public void sendToChain(String mesg) {
            System.out.println("No one can handle -->  " + mesg);
    }
    
}