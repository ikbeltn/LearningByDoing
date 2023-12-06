package Übungen;

import java.util.Scanner;

public class MethodeReturn {
    public static void main(String[] args) {
        int summe = rechner(10, 5, '+');
        System.out.println(summe);
    }

    public static int rechner(int a, int b, char op) {
        int summe;

        if (op == '+') {
            summe = a + b;
        } else if (op == '-') {
            summe = a - b;
        } else if (op == '*') {
            summe = a * b;
        } else if (op == '/') {
            summe = a / b;
        } else {
            summe = 0;
        }
        return summe;
    }

}
