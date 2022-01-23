package de.telekom.sea7.base;

public class Auto extends BaseObject {

	public Auto(Object parent, int id) {
	   super(id); // Aufruf des Constructors von BaseObject
		this.parent = parent;
	}

	public Auto(int id) {
		super(id); // Aufruf des Constructors von BaseObject
	}

	public String toString() {
		String a = "Auto," + super.toString();
		return a;
//
	}

	private Object parent;
}
