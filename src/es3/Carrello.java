package es3;

class Carrello {
    Cliente clienteAssociato;
    Articolo[] elencoArticoli;
    double totaleCostoArticoli;

    // costruttore
    public Carrello(Cliente clienteAssociato) {
        this.clienteAssociato = clienteAssociato;
        this.elencoArticoli = new Articolo[10]; // Limitiamo a 10 articoli per semplicità
        this.totaleCostoArticoli = 0.0;
    }

    // aggiungere un articolo al carrello
    public void aggiungiArticolo(Articolo articolo) {
        for (int i = 0; i < elencoArticoli.length; i++) {
            if (elencoArticoli[i] == null) {
                elencoArticoli[i] = articolo;
                totaleCostoArticoli += articolo.prezzo;
                break;
            }
        }
    }

    // metodo per stampare il carrello
    public void stampaDettagliCarrello() {
        System.out.println("Cliente: " + clienteAssociato.nome + " " + clienteAssociato.cognome);
        System.out.println("Email: " + clienteAssociato.email);
        System.out.println("Data iscrizione: " + clienteAssociato.dataIscrizione);
        System.out.println("Articoli nel carrello:");
        for (Articolo articolo : elencoArticoli) {
            if (articolo != null) {
                System.out.println("- Codice: " + articolo.codiceArticolo + ", Descrizione: " + articolo.descrizioneArticolo + ", Prezzo: " + articolo.prezzo);
            }
        }
        System.out.println("Totale costo articoli: " + totaleCostoArticoli + " euro");
    }
}
