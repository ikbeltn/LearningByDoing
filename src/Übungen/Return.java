package Übungen;

import java.util.Objects;
import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        taschenrechner();

    }
    public static void taschenrechner() {

        int summe = 0;

        System.out.println("Bitte geben Sie die erste Zahl ein: ");
        Scanner scan1 = new Scanner(System.in);
        int uno = scan1.nextInt();
        System.out.println("Bitte geben Sie die zweite Zahl ein: ");
        Scanner scan2 = new Scanner(System.in);
        int dos = scan2.nextInt();
        System.out.println("Bitte geben Sie den Operator ein: ");
        Scanner scan3 = new Scanner(System.in);
        String op = scan3.next();


        if (Objects.equals(op, "+")) {
            summe = uno + dos;
        }else if (Objects.equals(op, "-")) {
            summe = uno - dos;
        }

        System.out.println("Das Ergebnis ist: " + summe);
    }
}
