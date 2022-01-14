package de.telekom.sea7.base;

//public class Application extends BaseObject extends Object
public class Application extends BaseObject {
	public Application() { // Construktor
		super(null, 1);

	}

	public void run(String[] args) {
		Auto auto3 = new Auto(6);
		Auto auto2 = new Auto(5);
		Auto auto1 = new Auto(4);
		System.out.println(auto1.toString());
		System.out.println(auto1.getParent()+"  ID : "+auto1.getId());
	    System.out.println("Hier ist die ID: Nr"+auto1.getMycounter());
	    System.out.println("Hier ist die ID: Nr"+auto2.getMycounter());
	    System.out.println("Hier ist die ID: Nr"+auto3.getMycounter());
	}

}
