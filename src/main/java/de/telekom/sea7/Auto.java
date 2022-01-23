package de.telekom.sea7;

public class Auto {
	private String hersteller;
	private String modell;
	private String farbe;
	private int leistung;
	private int hubraum;
	private boolean schiebedach;
	private boolean klima;

	public String getHersteller() {
		return hersteller;
	}

	public void setHersteller(String hersteller) {
		this.hersteller = hersteller;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarbe() {
		return farbe;
	}

	public void setFarbe(String farbe) {
		this.farbe = farbe;
	}

	public int getLeistung() {
		return leistung;
	}

	public void setLeistung(int leistung) {
		this.leistung = leistung;
	}

	public int getHubraum() {
		return hubraum;
	}

	public void setHubraum(int hubraum) {
		this.hubraum = hubraum;
	}

	public boolean isSchiebedach() {
		return schiebedach;
	}

	public void setSchiebedach(boolean schiebedach) {
		this.schiebedach = schiebedach;
	}

	public boolean isKlima() {
		return klima;
	}

	public void setKlima(boolean klima) {
		this.klima = klima;
	}

}
