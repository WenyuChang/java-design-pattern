package Mediator;

/**
 * Intent
 * 
 * Define an object that encapsulates 
 * how a set of objects interact. 
 * Mediator promotes loose coupling by 
 * keeping objects from referring to each 
 * other explicitly, and it lets you vary 
 * their interaction independently.
 */
public class Client {

	public static void main(String[] args) {
		Mediator myMed = new ConcreteMediator();
        ColleagueA a = new ColleagueA(myMed);
        ColleagueB b = new ColleagueB(myMed);
        ColleagueC c = new ColleagueC(myMed);

        a.sendNotion();
        System.out.println();
        b.sendNotion();
        System.out.println();
        c.sendNotion();
	}

}
