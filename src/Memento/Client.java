package Memento;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Intent
 * 
 * Without violating encapsulation, 
 * capture and externalize an object's 
 * internal state so that the object can 
 * be restored to this state later.
 */
public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
        System.out.println("-----  Please edit text  -----");
        System.out.println("Usage: input any string to edit");
        System.out.println("Usage: input \"undo\" to undo your edit");
        System.out.println("Usage: input \"end\" to end edit");
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));            
            String str = "";
            while(true) {
                str = in.readLine();
                if(str.equals("end")) {
                    System.out.println("-----  End edit  -----");
                    break;
                } else if(str.equals("undo")) {
                    originator.setMemento();
                } else { 
                    if(!str.equals("")) {
                        originator.addText(str);
                        originator.createMemento();
                    }
                }
                System.out.println("--Input Text is :" + originator.getText());
            }
        } catch(IOException e) {
            System.out.println("I/O Error !");
            System.exit(1);
        }

	}

}
