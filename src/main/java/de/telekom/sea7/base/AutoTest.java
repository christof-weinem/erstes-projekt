package de.telekom.sea7.base;

public class AutoTest {
public static void main(String[] args) {
	Auto auto = new Auto(5);
	System.out.println(auto.getId());
	System.out.println(auto.toString());
	System.out.println(auto.toString());
	System.out.println(auto.getParent()+"  ID : "+auto.getId());
}
}
