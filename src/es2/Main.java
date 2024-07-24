package es2;

public class Main {
    public static void main(String[] args) {
        // creazione del SIM
        SIM miaSIM = new SIM("123-456-7890");

        // Ricarica dela SIM
        miaSIM.ricarica(10.0);

        // Aggiungi alcune chiamate
        miaSIM.aggiungiChiamata("321-654-0987", 5);
        miaSIM.aggiungiChiamata("987-654-3210", 10);
        miaSIM.aggiungiChiamata("456-789-0123", 1);

        miaSIM.stampaDatiSIM();
    }
}

