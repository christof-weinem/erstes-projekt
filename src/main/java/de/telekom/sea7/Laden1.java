package de.telekom.sea7;

public class Laden1 {

	public static void main(String[] args) {

		int i = 5; // Zahl
		int j = 6;

		String text = new String("Hallo"); // <- das macht Java für dich

		Bier1 altbier = new Bier1(); // Bier ( Preis)
		Bier1 bockbier = new Bier1();
		Bier1 pils = new Bier1();
		Bier1 dunkel = new Bier1();

		String ort = "Hamburg"; // Laden liegt in

		altbier.setPreis(75);

		altbier.preisanpassen(2);
		
		pils.setPreis(0.9);
		dunkel.setPreis(1.1);
		pils.setName("Pils");
		dunkel.setName("Dunkel");

		String vorlage_preis ="Der Verkaufspreis für %s beträgt %.2f €.";
		String vorlage_netto ="Der Nettopreis für %s beträgt %.2f €.";
		String ausgabe_preis = String.format(vorlage_preis , dunkel.getName(), dunkel.getPreis());
		String ausgabe_netto = String.format(vorlage_netto , dunkel.getName(), dunkel.getNetto());
		System.out.println(ausgabe_preis);
		System.out.println(ausgabe_netto);
		ausgabe_preis = String.format(vorlage_preis , pils.getName(), pils.getPreis());
		ausgabe_netto = String.format(vorlage_netto , pils.getName(), pils.getNetto());
		System.out.println(ausgabe_preis);
		System.out.println(ausgabe_netto);

// Bier.getPreis() = 75;

//		System.out.println("Verkauf in " + ort);
//		System.out.println("Verkaufspreis ist " + altbier.getPreis());
//		System.out.println("Steuer bei " + altbier.getSteuer());

	}

}