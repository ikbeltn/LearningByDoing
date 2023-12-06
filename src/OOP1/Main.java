package OOP1;

public class Main {
    public static void main(String[] args) {
        int zahl = 5;
        System.out.println(zahl);

        //Datentype Variablenname = new Konstruktor();
        Auto bmw = new Auto();
        System.out.println(bmw);
        bmw.preis = 10000;
        bmw.marke = "BMW";

        System.out.println("Preis: " + bmw.preis + " Marke: " + bmw.marke);

        Auto audi = new Auto(4, 20000, "Audi");

        System.out.println("Preis: " + audi.preis + " Marke: " + audi.marke + " Reifenanzahl: " + audi.reifen);

        audi.gasgeben();
        audi.bremsen();
        audi.vergleichePreis(30000);
    }
}
