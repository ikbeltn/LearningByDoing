package Übungen;

import java.util.Scanner;

public class Übung4 {
    public static void main(String[] args) {

        System.out.println("In welchem Jahr wurde Amin geboren?");
        System.out.println("a) 1999, b) 2000, c) 2002, d) 2003");
        System.out.println("Bitte geben Sie die Antwort ein: (Buchstabe...) ");
        String antwort = "d";
        Scanner scan1 = new Scanner(System.in);
        String eingabe = scan1.nextLine();

        if (eingabe.equals(antwort)) {
            System.out.println("Richtig!");
        } else {
            System.out.println("Falsch!");
            System.out.println("Tippen Sie OK ein, für die Lösung!");
            Scanner scan2 = new Scanner(System.in);
            String eingabe2 = scan2.nextLine();
            if (eingabe2.equals("OK")) {
                System.out.println("Die Lösung ist: " +antwort);
            } else {
                System.out.println("Du elendiger Hund, nicht mal das bekommst du hin!");
            }
        }
    }
}
