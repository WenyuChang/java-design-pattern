package Mediator;
/**
 *  A concrete mediator
 */
public class ConcreteMediator implements Mediator {
    private ColleagueA a;
    private ColleagueB b;
    private ColleagueC c;

    public ConcreteMediator() {
    }
    public void Register(IColleague colleague, String type) {
        if(type == "A") {
        	a = (ColleagueA)colleague;
        } else if (type == "B") {
        	b = (ColleagueB)colleague;
        } else if (type == "C") {
        	c = (ColleagueC)colleague;
        }
    }
    public void Changed(String type) {
        if(type == "A") {
        	b.action();
        } else if (type == "B") {
        	c.action();
        } else if (type == "C") {
        	a.action();
        	b.action();
        }
    }
}