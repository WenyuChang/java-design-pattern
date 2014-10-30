package ChainOfResponsibility;
/**
 *  The interface of the chain
 *  You can use AddChain function to modify the chain dynamically
 */
public interface IChain  {
    public void addChain(IChain c);
    public void sendToChain(String mesg);
    public IChain getChain();
}