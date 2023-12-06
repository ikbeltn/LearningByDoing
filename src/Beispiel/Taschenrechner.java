package Beispiel;

public class Taschenrechner {
    public static void plus(int a, int b) {
        System.out.println("Ergebnis: " + (a + b));
    }
    public static void minus(int a, int b) {
        System.out.println("Ergebnis: " + (a - b));
    }
    public static void mal(int a, int b) {
        System.out.println("Ergebnis: " + (a * b));
    }
    public static void geteilt(int a, int b) throws NichtDurchNullTeilenException {
        if (b == 0) {
            throw new NichtDurchNullTeilenException("Hey du darfst nicht durch Null teilen");
        } else {
            System.out.println("Ergebnis: " + (a / b));
        }
    }
}
