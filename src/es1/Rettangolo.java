package es1;

class Rettangolo {
    double larghezza;
    double altezza;

    public Rettangolo(double larghezza, double altezza) {
        this.larghezza = larghezza;
        this.altezza = altezza;
    }

    // per calcolare l'area
    public double calcolaArea() {
        return larghezza * altezza;
    }

    // per calcolare il perimetro
    public double calcolaPerimetro() {
        return 2 * (larghezza + altezza);
    }
}
