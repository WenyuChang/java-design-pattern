package ChainOfResponsibility;


/**
 * Intent
 * 
 * Avoid coupling the sender of a request to its receiver 
 * by giving more than one object a chance to handle the 
 * request. Chain the receiving objects and pass the request 
 * along the chain until an object handles it.
 */
public class Client {

	public static void main(String[] args) {
		Manager aManager = new Manager();
        ProjectManager aPM = new ProjectManager();
        Programmer aProgrammer = new Programmer();
        QA aQA = new QA();
        Others others = new Others();

        aManager.addChain(aPM);
        aPM.addChain(aProgrammer);
        aProgrammer.addChain(aQA);
        aQA.addChain(others);

        aManager.sendToChain("Get Project");
        aManager.sendToChain("Design");
        aManager.sendToChain("Coding");
        aManager.sendToChain("Test");
        aManager.sendToChain("Kill La Deng!");

	}

}
