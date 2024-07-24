package es1;

public class GestioneRettangoli {

    // per stampare area e perimetro del rettangolo
    public static void stampaRettangolo(Rettangolo r) {
        double area = r.calcolaArea();
        double perimetro = r.calcolaPerimetro();
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }

    // per stampare area e perimetro dei due rettangoli e la loro somma
    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
        System.out.println("Primo Rettangolo:");
        stampaRettangolo(r1);
        System.out.println("Secondo Rettangolo:");
        stampaRettangolo(r2);

        double sommaAree = r1.calcolaArea() + r2.calcolaArea();
        double sommaPerimetri = r1.calcolaPerimetro() + r2.calcolaPerimetro();

        System.out.println("Somma delle Aree: " + sommaAree);
        System.out.println("Somma dei Perimetri: " + sommaPerimetri);
    }

    public static void main(String[] args) {
        // creazione di due rettangoli
        Rettangolo rettangolo1 = new Rettangolo(3, 2);
        Rettangolo rettangolo2 = new Rettangolo(5, 7);

        // area e perimetro del primo rettangolo
        System.out.println("Dettagli del primo rettangolo:");
        stampaRettangolo(rettangolo1);

        // area e perimetro del secondo rettangolo
        System.out.println("\nDettagli del secondo rettangolo:");
        stampaRettangolo(rettangolo2);

        // dettagli e somme dei due rettangoli
        System.out.println("\nDettagli e somme dei due rettangoli:");
        stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}
