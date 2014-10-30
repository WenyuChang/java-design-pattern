package ChainOfResponsibility;
/**
 *  A member of the chain
 *  The resposibility of QA is test 
 */

public class QA implements IChain {
    private IChain nextChain = null;
    private String responsibility = "Test";
    
    public QA() {
    }
    public void addChain(IChain c) {
        nextChain = c;
    }
    
    public IChain getChain() {
        return nextChain;
    }
    
    public void sendToChain(String mesg) {
        if(mesg.equals(responsibility)) {
            System.out.println("A QA  -->  Test");
        } else {
            if(nextChain != null) {
                nextChain.sendToChain(mesg);
            }
        }
    }
    
}