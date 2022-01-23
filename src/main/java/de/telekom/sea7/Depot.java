package de.telekom.sea7;

public class Depot {

	private Object[] liste = new Object[9];

	public Depot() {
		for (int i = 0; i < liste.length; i++) {
			liste[i] = i;
		}
	}

	public Object getContent(int index) {
		if ((index < 0) && (liste.length > index)) {
			System.out.println("Ungültige Eingabe von " + index);
			return 0;
		} else {
			return liste[index];
		}
	}

	public Object[] getListe() {
		return liste;
	}

	public void setClear() {
		for (int i = 0; i < liste.length; i++) {
			liste[i] = null;
		}
	}

	public boolean isEmpty() {
		for (int i = 0; i < liste.length; i++) {
			var element = liste[i];
			if (element != null)
				return false;
		}
		return true;
	}

	public boolean isFull() {
		for (int i = 0; i < liste.length; i++) {
			var element = liste[i];
			if (element == null)
				return false;
		}
		return true;
	}

	public int size() {
		int counter = 0;
		for (int i = 0; i < liste.length; i++) {
			var element = liste[i];
			if (element != null)
				counter++;
		}
		return counter;
	}

	public boolean contains(Object object) {
		for (int i = 0; i < liste.length; i++) {
			var element = liste[i];
			if ((element != null) && (element.equals(object)))
				return true;
		}
		return false;
	}

	public void setListe(Object element, int index) {
		this.liste[index] = element;
	}

	public String toString() {
		String ausgabe = "";
		for (int i = 0; i < liste.length; i++) {
			var element = liste[i];
			if (element == null)
				ausgabe = ausgabe + "null, ";
			else
				ausgabe += element.toString() + ", ";
		}
		return ausgabe;
	}

	public int indexOf(Object object) {
		for (int i = 0; i < liste.length; i++) {
			var element = liste[i];
			if ((element != null) && (element.equals(object)))
				return i;
		}
		return -1;
	}
}
