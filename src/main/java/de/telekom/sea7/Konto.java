package de.telekom.sea7;

//Muss extends Iterable !!!
public interface Konto extends Iterable {
//Interface wurde von Klasse Depot abgeleitet, die schon überwiegend Funktionen von ArrayList nachbildet

	Object getContent(int index);

	Object[] getListe();

	void setClear();

	boolean isEmpty();

	boolean isFull();

	int size();

	boolean contains(Object object);

	void setListe(Object element, int index);

//Vorschlag void add(Object element, int index);
	String toString();

	int indexOf(Object object);

}
