package de.telekom.sea7;

public class BankMain {
	public static void main(String[] args) {
		
		Bank uew1 = new Bank();
		uew1.setEmpfaenger("Liesl Müller");
		uew1.setBetrag(312.64);
		uew1.setKommentar("ebay-Kauf vom 06.01.2022");
		uew1.setIban("DE12 1234 1234 1234 1234 12");
		
	 System.out.println("Daten von uew1 :");
	 System.out.println("Empfaenger     : "+uew1.getEmpfaenger());
	 System.out.println("Kommentar      : "+uew1.getKommentar());
	 System.out.println("IBAN           : "+uew1.getIban());
	 System.out.println("Betrag         : "+uew1.getBetrag()+" €");
	 System.out.println();
}
}
