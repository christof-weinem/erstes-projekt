package de.telekom.sea7;

public class Laden0 {

	public static void main(String[] args) {

		int i; // Zahl
		Bier0 bier0; // Bier ( Preis)

		String ort = "Hamburg"; // Laden liegt in

		Bier0.setPreis(80);

		Bier0.preisanpassen(2);

// Bier.getPreis() = 75;

		System.out.println("Verkauf in " + ort);
		System.out.println("Verkaufspreis ist " + Bier0.getPreis());
		System.out.println("Steuer bei " + Bier0.getSteuer());

	}

}
