package ChainOfResponsibility;
/**
 *  A member of the chain
 *  The resposibility of PM is to design the project 
 */

public class ProjectManager implements IChain {
    private IChain nextChain = null;
    private String responsibility = "Design";
    
    public ProjectManager() {
    }
    public void addChain(IChain c) {
        nextChain = c;
    }
    
    public IChain getChain() {
        return nextChain;
    }
    
    public void sendToChain(String mesg) {
        if(mesg.equals(responsibility)) {
            System.out.println("A PM  -->  Design");
        } else {
            if(nextChain != null) {
                nextChain.sendToChain(mesg);
            }
        }
    }
    
}