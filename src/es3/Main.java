package es3;

public class Main {
    public static void main(String[] args) {
        // Creazione di un cliente
        Cliente cliente1 = new Cliente("C001", "John", "Guevarra", "john.guevarra@gmail.com", "2023-07-23");

        // Creazione di alcuni articoli
        Articolo articolo1 = new Articolo("A001", "latte", 2, 10);
        Articolo articolo2 = new Articolo("A002", "uova", 5, 50);
        Articolo articolo3 = new Articolo("A003", "pane", 3, 30);

        // Creazione di un carrello e aggiunta di articoli
        Carrello carrello = new Carrello(cliente1);
        carrello.aggiungiArticolo(articolo1);
        carrello.aggiungiArticolo(articolo2);
        carrello.aggiungiArticolo(articolo3);

        // Stampa dei dettagli del carrello
        carrello.stampaDettagliCarrello();
    }
}
