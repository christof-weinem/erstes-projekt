package de.telekom.sea7;

public class Terminaleingabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Bitte gib Deinen Namen ein oder beende mit der Eingabe von:  'exit' ");
        String eingabe = System.console().readLine();
    	if (eingabe.startsWith("exit")) { 
		   System.out.println("Programm wird beendet!"); 
	    }
        while ( !eingabe.startsWith("exit")) {
        	System.out.println("Hallo "+eingabe+"!");
        	System.out.println("Bitte gib Deinen Namen oder beende mit der Eingabe von:  'exit' ");
        	eingabe = System.console().readLine();
        	if (eingabe.startsWith("exit")) { 
        		System.out.println("Programm wird beendet!");
        	}
        }
	}
}
