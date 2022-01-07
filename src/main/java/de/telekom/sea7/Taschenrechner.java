package de.telekom.sea7;

public class Taschenrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ergebnis = 0.1;
		String eingabe = "";
		System.out.println("T A S C H E N R E C H N E R");
		System.out.print("Beenden: 'exit', Start: sonstige Eingabe: ");
		eingabe = System.console().readLine();
		while (!eingabe.startsWith("exit")) {
			System.out.print("Bitte 1.Zahl eingeben                   : ");
			String zahl1 = System.console().readLine();
			System.out.print("Bitte Operator eingeben [+,-,* oder /]  : ");
			String operator = System.console().readLine();
			System.out.print("Bitte 2. Zahl eingeben [+,-,* oder /]   : ");
			String zahl2 = System.console().readLine();
			switch (operator) {
			case "+":
				ergebnis = Float.parseFloat(zahl1) + Float.parseFloat(zahl2);
				System.out.println("Ergebnis                                : " + zahl1 + " + " + zahl2 + " = " + ergebnis);
				break;
			case "-":
				ergebnis = Float.parseFloat(zahl1) - Float.parseFloat(zahl2);
				System.out.println("Ergebnis                                : " + zahl1 + " - " + zahl2 + " = " + ergebnis);
				break;
			case "*":
				ergebnis = Float.parseFloat(zahl1) * Float.parseFloat(zahl2);
				System.out.println("Ergebnis                                : " + zahl1 + " * " + zahl2 + " = " + ergebnis);
				break;
			case "/":
				ergebnis = Float.parseFloat(zahl1) / Float.parseFloat(zahl2);
				System.out.println("Ergebnis                                : " + zahl1 + " / " + zahl2 + " = " + ergebnis);
				break;
			default:
				System.out.println("Fehlerhafter Operator, Bitte kpl. Neueingabe ");
			}
			System.out.print("Beenden: 'exit', Start: sonstige Eingabe: ");
			eingabe = System.console().readLine();
		}
	}
}
//		System.out.println("Taschenrechner wird beendet");		
//    	if (eingabe.startsWith("exit")) { 
//		   System.out.println("Programm wird beendet!"); 
//	    }
//        while ( !eingabe.startsWith("exit")) {
//        	System.out.println("Hallo "+eingabe+"!");
//        	System.out.println("Bitte gib Deinen Namen oder beende mit der Eingabe von:  'exit' ");
//        	eingabe = System.console().readLine();
//        	if (eingabe.startsWith("exit")) { 
//        		System.out.println("Programm wird beendet!");
//        	}
//        }
//	}
//}
