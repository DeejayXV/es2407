package es2;
import java.util.ArrayList;
import java.util.List;

class SIM {
    private String numeroTelefono;
    private double creditoDisponibile;
    private List<Chiamata> ultimeChiamate;

    // costruttore per il numero di telefono, credito inizialmente a 0 e la lista delle chiamate vuota
    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.creditoDisponibile = 0.0;
        this.ultimeChiamate = new ArrayList<>();
    }
    // per aggiungere una chiamata alla lista delle ultime chiamate
    public void aggiungiChiamata(String numeroChiamato, int durataMinuti) {
        Chiamata nuovaChiamata = new Chiamata(numeroChiamato, durataMinuti); // crea una nuova chiamata
        if (ultimeChiamate.size() == 5) {
            ultimeChiamate.remove(0); // rimuove la chiamata più vecchia
        }
        ultimeChiamate.add(nuovaChiamata);
    }

    // stampa i dati della SIM
    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + creditoDisponibile + " euro");
        System.out.println("Ultime 5 chiamate effettuate:");

        //stampa i dettagli delle ultime chiamate fatte
        for (Chiamata chiamata : ultimeChiamate) {
            System.out.println("- Numero chiamato: " + chiamata.numeroChiamato + ", Durata: " + chiamata.durataMinuti + " minuti");
        }
    }

    //ricaricare il credito della SIM
    public void ricarica(double importo) {
        creditoDisponibile += importo; // aggiunge credito
    }
}

class Chiamata {
    String numeroChiamato;
    int durataMinuti;

    // costruttore per il numero chiamato e la durata della chiamata
    public Chiamata(String numeroChiamato, int durataMinuti) {
        this.numeroChiamato = numeroChiamato;
        this.durataMinuti = durataMinuti;
    }
}
