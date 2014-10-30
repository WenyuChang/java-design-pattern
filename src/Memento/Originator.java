package Memento;
/**
 *  Our test Originator class with Memento class.
 *  Put 2 class into 1 file, so Memento member can be  visited by Originator 
 */

public class Originator  {
    private StringBuffer strbuf = new StringBuffer();
    private String state = "";
    private Memento memo;
    public Originator() {
        memo = new Memento();
    }
    public void addText(String addStr) {
        state = addStr;
        strbuf.append(addStr);
    }
    public void createMemento() {
        memo.addMemo(state);
    }
    public void setMemento() {
        String tmp = memo.getState();
        if(tmp != null) {            
            int start = strbuf.length() - tmp.length();
            int end = strbuf.length();
            if(start >= 0) {
                strbuf.delete(start,  end);
            } else {
                System.out.println("Get Memo Error !");
            }
        }
    }
    public String getText() {
        return strbuf.toString();
    }
}