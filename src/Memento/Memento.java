package Memento;

import java.util.LinkedList;

public class Memento {
    LinkedList<String> memoList;
    
    public Memento() {
        memoList = new LinkedList<String>();
    }
    public void addMemo(String state) {
        memoList.addLast(state);
    }
    public String getState() {
        if(memoList.size() != 0) {
            String tmp = (String)memoList.getLast();
            memoList.removeLast();
            return tmp;
        } else {
            return null;
        }      
    }
}
