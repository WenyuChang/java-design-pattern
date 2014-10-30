package Interprete;

import java.util.Hashtable;

public class Context  {
    private Hashtable<String, Boolean> context = new Hashtable<String, Boolean>();
    
    public void Assign(String name, boolean val) {
        context.put(name, val);
    }
    public boolean LookUp(String name) {
        return ((Boolean)context.get(name)).booleanValue();
    }
    
    public Context() {}
}