package Übungen;

import java.util.Scanner;

public class Übung6 {
    public static void main(String[] args) {

        System.out.println("Press 'e' to start the Pre-loop");
        String start = "e";
        Scanner scan1 = new Scanner(System.in);
        String input = scan1.nextLine();

        if (input.equals(start)) {
            System.out.println("Pre-loop started");
            for (int i = 0; i < 10; i++) {
                System.out.println("i = " + i);
            }
        } else {
            System.out.println("Pre-loop not started");
        }
    }
}
