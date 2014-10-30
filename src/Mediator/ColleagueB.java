package Mediator;
/**
 *  A concrete colleague 
 */

public class ColleagueB implements IColleague {
    private final String type = "B";
    private Mediator med;
    public ColleagueB(Mediator m) {
        med = m;
        med.Register(this, type);
    }
    public void sendNotion() {
        System.out.println("-----  B is sending notion now !  -----");
        med.Changed(type);
    }
    public void action() {
        System.out.println("  B is changed by mediator ");
    }
}