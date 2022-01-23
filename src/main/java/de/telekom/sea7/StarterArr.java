package de.telekom.sea7;

public class StarterArr {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		Integerliste meineListe = new Integerliste();

		System.out.println("Listenelemente Original: " + meineListe.toString());
		System.out.println("Listenlänge: " + meineListe.getListenLaenge());
		System.out.println("Listensumme: " + meineListe.getSumliste());

		meineListe.setListenLaenge(8);
		System.out.println("Listenelemente neue Länge + : " + meineListe.toString());

		meineListe.setListenLaenge(5);
		System.out.println("Listenelemente neue Länge - : " + meineListe.toString());

		meineListe.setListeClear();
		System.out.println("Listenelemente Clear: " + meineListe.toString());

		meineListe.setListeRandom();

		System.out.println("Listenelemente Zufall: " + meineListe.toString());
		System.out.println("Listensumme: " + meineListe.getSumliste());
	}
}