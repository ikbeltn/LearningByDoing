package Übungen;

import java.util.Scanner;

public class Übung5 {
    public static void main(String[] args) {
        String antwort = "d";

        System.out.println("In welchem Jahr ist Mohamed geboren?");
        System.out.println("a) 1999, b) 2001, c) 2002, d) 2003");

        System.out.println("Bitte geben Sie die Antwort ein: (Buchstabe...) ");

        Scanner scan1 = new Scanner(System.in);
        String eingabe = scan1.nextLine();

        switch (eingabe) {
            case "a":
                System.out.println("Falsch!");
                break;
            case "b":
                System.out.println("Richtig!");
                break;
            case "c":
                System.out.println("Falsch!");
                break;
            case "d":
                System.out.println("Falsch!");
                break;
            default: {
                System.out.println("Versuche es erneut!");
            }
//Falls der default eintritt, soll die Eingabe wiederholt werden und die Eingabe soll erneut überprüft werden.
            System.out.println("Bitte geben Sie die Antwort ein: (Buchstabe...) ");
            eingabe = scan1.nextLine();
            switch (eingabe) {
                case "a":
                    System.out.println("Falsch!");
                    break;
                case "b":
                    System.out.println("Richtig!");
                    break;
                case "c":
                    System.out.println("Falsch!");
                    break;
                case "d":
                    System.out.println("Falsch!");
                    break;
                default: {
                    System.out.println("Versuche es erneut!");
                }
            }
        }

    }
}
