package de.telekom.sea7;

public class ApplicationKonto {
public ApplicationKonto() { // Construktor
}

public void run(String[] args) {

Konto konto = new KontoImpl();
ViewKonto viewkonto = new ViewKonto();
ModelKonto modelkonto0 = new ModelKonto();

ModelKonto modelkonto1 = new ModelKonto();




modelkonto0.setEmpfaenger("Harry");
modelkonto0.setIban("DE123456789");
modelkonto1.setEmpfaenger("Eva");
modelkonto1.setIban("SE3456789");

konto.setListe(modelkonto0, 0);
konto.setListe(modelkonto1, 1);

System.out.println("Zahlung 1#####" + konto.getContent(0));

viewkonto.setModelkonto(modelkonto0);
viewkonto.Kontoanzeigen();
viewkonto.setModelkonto(modelkonto1);
viewkonto.Kontoanzeigen();

// System.out.println(auto.toString());
// System.out.println(auto.getParent());
}
}