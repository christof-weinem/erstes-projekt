package de.telekom.sea7;

public class Laden {

	public static void main(String[] args) {

		int i = 5; // Zahl
		int j = 6;

		String text = new String("Hallo"); // <- das macht Java für dich

		Bier altbier = new Bier(); // Bier ( Preis)
		Bier bockbier = new Bier();
		Bier pils = new Bier();
		Bier dunkel = new Bier();

		String ort = "Hamburg"; // Laden liegt in

		altbier.setPreis(75);
		altbier.preisanpassen(2);
		
// Bier.getPreis() = 75;

		System.out.println("Verkauf in " + ort);
		System.out.println("Verkaufspreis ist " + altbier.getPreis());
		System.out.println("Steuer bei " + altbier.getSteuer());

	}

}