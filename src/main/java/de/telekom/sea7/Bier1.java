package de.telekom.sea7;

public class Bier1 { // Datentyp

	private double preis = 2; // 400
	private double netto = 1.86; // ?
	private double steuer = 0.38; // ?
	private double steuersatz = 19; // Steuersatz in %
	private String name;

	public void preisanpassen(double preisanpassung) {
		preis = preis * preisanpassung;
		preisrechnen();
	}

	private void preisrechnen() {
		netto = preis * (100-steuersatz)/100; // 7 / 100 = 0 .07
		steuer = preis - netto;
	}

	public double getPreis() {
		return preis;
	}

	public double getSteuer() {
		return steuer;
	}
	
	public double getNetto() {
		return netto;
	}

	public void setPreis(double i) {
		preis = i;
		preisrechnen();
	}

	public String getName() {
		return name;
		}
	
	public void setName(String biername) {
		name = biername;
	}
}
