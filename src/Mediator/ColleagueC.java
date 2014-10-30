package Mediator;
/**
 *  A concrete colleague 
 */

public class ColleagueC implements IColleague {
    private final String type = "C";
    private Mediator med;
    public ColleagueC(Mediator m) {
        med = m;
        med.Register(this, type);
    }
    public void sendNotion() {
        System.out.println("-----  C is sending notion now !  -----");
        med.Changed(type);
    }
    public void action() {
        System.out.println("  C is changed by mediator ");
    }
}