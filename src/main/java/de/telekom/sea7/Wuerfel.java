package de.telekom.sea7;

public class Wuerfel {

	public static void main(String[] args) { // Ich baue einen Würfel, der solange würfelt bis eine 6 erscheint
// TODO Auto-generated method stub
		int counter = 0;
		int number = 0;
		double number1=0;

		while (number != 6) {
			number = (int) (Math.random() * 6) + 1;
			counter++;
		}
		System.out.println("Es wurden " + counter + " Wuerfe benoetigt um eine 6 zu wuerfeln");
		number1 = Math.sqrt(9);
				System.out.println("Wurzelvon 9 Math.sqrt(9) :"+number1);		
	}

}
