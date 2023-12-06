package Übungen;

public class Methoden {
    public static void main(String[] args) {
        ausgabe();
        summe();

    }
    public static void ausgabe() {
        System.out.println("Sie haben die Methode ausgabe() aufgerufen");
    }
    public static void summe() {
        int a,b, summe;
        a = 10;
        b = 5;

        summe = a + b;
        System.out.println("Die Summe von " + a + " und " + b + " ist " + summe);
    }
}
