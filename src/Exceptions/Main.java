package Exceptions;

import Beispiel.NichtDurchNullTeilenException;
import Beispiel.Taschenrechner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
//        Taschenrechner.plus(2,4);
        try {

//            System.out.println("Bitte geben Sie Zahl 1 ein: ");
//            int a = scan.nextInt();
//            System.out.println("Bitte geben Sie Zahl 2 ein: ");
//            int b = scan.nextInt();

            Taschenrechner.geteilt(10, 5);

        } catch (NichtDurchNullTeilenException e) {
//            System.out.println("Man nicht durch Null teilen");
//            System.out.println("Bitte geben Sie neue Zahlen ein: ");
//            int newA = scan.nextInt();
//            int newB = scan.nextInt();

            System.out.println(e.getMessage());

//            try {
//                Taschenrechner.geteilt(newA, newB);
//            } catch (Exception ex) {
//                throw new RuntimeException(ex);
//            }
        } catch (Exception e1){

        }
        System.out.println("Programm läuft weiter");
    }
}
