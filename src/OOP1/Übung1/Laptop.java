package OOP1.Übung1;

public class Laptop {
    int ram;
    double preis;
    String marke;

    public Laptop(int ram, int preis, String marke) {
        this.ram = ram;
        this.preis = preis;
        this.marke = marke;
    }

    public void abfrage(){
        System.out.println("Der " + this.marke + " Laptop, hat " + this.ram + " und kostet " + this.preis);
    }
}
