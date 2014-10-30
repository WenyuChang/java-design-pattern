package Mediator;
/**
 *  A concrete colleague 
 */

public class ColleagueA implements IColleague {
    private final String type = "A";
    private Mediator med;
    
    public ColleagueA(Mediator m) {
        med = m;
        med.Register(this, type);
    }
    public void sendNotion() {
        System.out.println("-----  A is sending notion now !  -----");
        med.Changed(type);
    }
    public void action() {
        System.out.println("  A is changed by mediator ");
    }
}