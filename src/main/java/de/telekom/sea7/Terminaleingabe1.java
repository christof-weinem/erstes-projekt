package de.telekom.sea7;

public class Terminaleingabe1 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		System.out.println("Gib irgendwas ein oder gib 'exit' ein");

		String eingabe = System.console().readLine();
		System.out.println(eingabe);

		while (!eingabe.startsWith("exit")) {
			System.out.println("Gib irgendwas ein oder gib 'exit' ein");

			eingabe = System.console().readLine();
			System.out.println(eingabe);
		}
	}
}
