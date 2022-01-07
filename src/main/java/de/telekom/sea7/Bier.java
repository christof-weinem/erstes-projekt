package de.telekom.sea7;

public class Bier { // Datentyp

	private int preis = 200; // 400
	private int netto = 186; // ?
	private int steuer = 14; // ?
	private int steuersatz = 7; // Steuersatz in %

	public void preisanpassen(int preisanpassung) {
		preis = preis * preisanpassung;
		preisrechnen();
	}

	private void preisrechnen() {
		netto = preis * (100-steuersatz)/100; // 7 / 100 = 0 .07
		steuer = preis - netto;
	}

	public int getPreis() {
		return preis;
	}

	public int getSteuer() {
		return steuer;
	}

	public void setPreis(int i) {
		preis = i;
		preisrechnen();
	}
}
