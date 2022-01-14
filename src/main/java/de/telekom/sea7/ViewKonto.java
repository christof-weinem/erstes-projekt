package de.telekom.sea7;

public class ViewKonto {

	private ModelKonto modelkonto;

	public void Kontoanzeigen() {
		System.out.println("Sicht Viewkonto: " + this.modelkonto);
		System.out.println("Name: " + this.modelkonto.getEmpfaenger());
		System.out.println("IBAN: " + this.modelkonto.getIban());
	}

	public ModelKonto getModelkonto() {
		return modelkonto;
	}

	public void setModelkonto(ModelKonto amodelkonto) {
		this.modelkonto = amodelkonto;
	}
}
