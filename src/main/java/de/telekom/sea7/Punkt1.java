package de.telekom.sea7;

public class Punkt1 {
	private int x = 0;
	private int y = 0;

	public Punkt1() {
		System.out.println("Der Wert von x= " + x);
		System.out.println("Der Wert von y= " + y);
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public boolean equals(Punkt1 andre) {
		if (this.getX() == andre.getX() && this.getY() == andre.getY()) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Punkt1 p = null;

		Punkt1 p1 = new Punkt1();
		p1.setX(24);
		p1.setY(71);

		Punkt1 p2 = new Punkt1();
		p2.setX(170);
		p2.setY(42);

		Punkt1 p3 = p2;
		p3.setX(10000);
		p3.setY(-314);

		Punkt1 p4 = new Punkt1();
		p4.setX(10000);
		p4.setY(-314);

		new Punkt1();

		System.out.println(String.format("Referenz '%s', X = %s, Y = %s", p, 0, 0));
		System.out.println(String.format("Referenz '%s', X = %s, Y = %s", p1, p1.getX(), p1.getY()));
		System.out.println(String.format("Referenz '%s', X = %s, Y = %s", p2, p2.getX(), p2.getY()));
		System.out.println(String.format("Referenz '%s', X = %s, Y = %s", p3, p3.getX(), p3.getY()));
		System.out.println(String.format("Referenz '%s', X = %s, Y = %s", p4, p4.getX(), p4.getY()));

		if (p3 == p4) {
			System.out.println("p3 und p4 sind identisch");
		} else {
			System.out.println("p3 und p4 sind nicht identisch");
		}
		if (p3.equals(p4)) {
			System.out.println("gleich");
		} else {
			System.out.println("ungleich");
		}

	}

}
