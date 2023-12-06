package Übungen;

import java.util.Scanner;

public class Einlesen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte eine Zahl eingeben");
        double zahl = scan.nextDouble();
        System.out.println("Ihre Zahl lautet: " + zahl);

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Geben Sie Ihren namen ein: ");
        String zeichenkette = scan2.next();


    }
}
