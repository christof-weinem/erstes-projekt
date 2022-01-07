package de.telekom.sea7;

public class Bier0 {

	private static int preis = 200; // 400
	private static int netto = 186; // ?
	private static int steuer = 14; // ?
	private static int steuersatz = 10; // Steuersatz in %

	public static void preisanpassen(int preisanpassung) {
		preis = preis * preisanpassung;
		preisrechnen();
	}

	private static void preisrechnen() {
		netto = preis * (100-steuersatz)/100; // 7 / 100 = 0 .07
		steuer = preis - netto;
	}

	public static int getPreis() {
		return preis;
	}

	public static int getSteuer() {
		return steuer;
	}

	public static void setPreis(int i) {
		preis = i;
		preisrechnen();
	}
}
