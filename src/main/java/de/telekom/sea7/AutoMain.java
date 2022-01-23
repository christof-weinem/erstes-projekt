package de.telekom.sea7;

public class AutoMain {
	public static void main(String[] args) {

		Auto car1 = new Auto();
		Auto car2 = new Auto();

		car1.setHersteller("Volkswagen");
		car1.setModell("Polo");
		car1.setFarbe("gruen");
		car1.setLeistung(70);
		car1.setSchiebedach(false);
		car1.setKlima(true);
		car1.setHubraum(1200);
		car1.setFarbe("rot");
		
		System.out.println("Ausgabe car1 : "+car1.getHersteller()+" "+car1.getModell()+" in "+car1.getFarbe()+" ,"+car1.getLeistung()
		+"PS, "+car1.getHubraum()+" ccm");
		
		
	}
}
