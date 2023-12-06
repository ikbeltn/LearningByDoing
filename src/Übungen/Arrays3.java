package Übungen;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {

        int [] lottozahlen = new int[6];

        System.out.println("Geben Sie 'OK' ein, um die Lottozahlen zu generieren: ");

        Scanner scan1 = new Scanner(System.in);
        String eingabe = scan1.nextLine();

        if (eingabe.equals("OK")) {
            for (int i = 0; i < lottozahlen.length; i++){
                lottozahlen[i] = (int) (Math.random() * 49 + 1);
                System.out.println(lottozahlen[i]);
            }
        } else {
            System.out.println("Scammer wurde gescammt!");
        }
    }
}
