package Übungen;

import java.util.Scanner;

public class Übung3 {
    public static void main(String[] args) {


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihr Alter an: ");
        String alter = scan1.next();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihren Vornamen ein: ");
        String vorname = scan2.next();

        System.out.println("Hallo " + vorname + ", Sie sind " + alter + " Jahre alt.");
    }
}
