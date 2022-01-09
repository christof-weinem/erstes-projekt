package de.telekom.sea7;

public class Taschenrechner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ergebnis = 0.1;
		String zahl1 = "zahl1";
		String zahl2 = "zahl2";
		String eingabe = "";
		System.out.println("T A S C H E N R E C H N E R");
		System.out.print("Beenden: 'exit', Start: sonstige Eingabe: ");
		eingabe = System.console().readLine();
		while (!eingabe.startsWith("exit")) {
			while (isNumeric(zahl1) == false) {
				System.out.print("Bitte 1.Zahl eingeben                   : ");
				zahl1 = System.console().readLine();
			}
			System.out.print("Bitte Operator eingeben[+,-,*,/,x2,fac] : ");
			String operator = System.console().readLine();
			if (operator.equals("x2")) {
                Mittagspause1.sqr(Float.parseFloat(zahl1));
				break;
			}
			if (operator.equals("fac")) {
				faculty(Integer.parseInt(zahl1));
				break;
			}
			while (isNumeric(zahl2) == false) {
				System.out.print("Bitte 2. Zahl eingeben [+,-,* oder /]   : ");	
				zahl2 = System.console().readLine();
			}
			switch (operator) {
			case "+":
				ergebnis = Float.parseFloat(zahl1) + Float.parseFloat(zahl2);
				ausgabe(zahl1, operator, zahl2, ergebnis);
				break;
			case "-":
				ergebnis = Float.parseFloat(zahl1) - Float.parseFloat(zahl2);
				ausgabe(zahl1, operator, zahl2, ergebnis);
				break;
			case "*":
				ergebnis = Float.parseFloat(zahl1) * Float.parseFloat(zahl2);
				ausgabe(zahl1, operator, zahl2, ergebnis);
				break;
			case "/":
				ergebnis = Float.parseFloat(zahl1) / Float.parseFloat(zahl2);
				ausgabe(zahl1, operator, zahl2, ergebnis);
				break;
			default:
				System.out.println("Fehlerhafter Operator, Bitte kpl. Neueingabe ");
			}
			zahl1 = "zahl1";
			zahl2 = "zahl2"; 
			System.out.print("Beenden: 'exit', Start: sonstige Eingabe: ");
			eingabe = System.console().readLine();
		}
	}

	public static void ausgabe(String zahl1, String operator, String zahl2, double ergebnis) {
		System.out.println("Ergebnis                                : " + zahl1 + " " + operator + " " + zahl2 + " = " + ergebnis);
	}

	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
	public static int faculty (int zahl) {
		int result = 1;
		int n = 1;
//		while (n<=zahl) {
//			result=result*n;
//			n++;
//		}
		for (n=1; n<=zahl; n++) {
			result=result*n;
		}
		System.out.println("Ergebnis                                : "+result);
		return result;
		}
}
