package Mediator;
/**
 *  An abstract Mediator
 */
public interface Mediator  {
    public void Register(IColleague c, String type);
    public void Changed(String type);
}