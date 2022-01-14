package de.telekom.sea7.base;

class BaseObject /* extends Object */ {

	private static int counter = 0;
	private int mycounter = 0;

	private int id;
	private Object parent;

	public BaseObject(Object parent, int id) {
		this.id = id; // BaseObject(id);
		this.parent = parent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		String b = "BaseObject," + "Object " + super.toString();
		return b;
	}

	public Object getParent() {
		return parent;
	}

	public void setParent(Object parent) {
		this.parent = parent;
	}
	public int getMycounter() {
		return this.mycounter;
	}
	public BaseObject(int id) {
		this.id = id;
		counter=counter+1;
	    this.mycounter=counter;
	}
}