package ChainOfResponsibility;
/**
 *  A member of the chain
 *  The resposibility of Programmer is coding 
 */

public class Programmer implements IChain {
    private IChain nextChain = null;
    private String responsibility = "Coding";
    
    public Programmer() {
    }
    public void addChain(IChain c) {
        nextChain = c;
    }
    
    public IChain getChain() {
        return nextChain;
    }
    
    public void sendToChain(String mesg) {
        if(mesg.equals(responsibility)) {
            System.out.println("A Programmer  -->  Coding");
        } else {
            if(nextChain != null) {
                nextChain.sendToChain(mesg);
            }
        }
    }
    
}
