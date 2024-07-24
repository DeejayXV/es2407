package es3;

class Articolo {
    String codiceArticolo;
    String descrizioneArticolo;
    double prezzo;
    int numeroPezziDisponibili;

    // Costruttore
    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int numeroPezziDisponibili) {
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.numeroPezziDisponibili = numeroPezziDisponibili;
    }
}
