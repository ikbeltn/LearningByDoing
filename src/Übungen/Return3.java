package Übungen;

public class Return3 {
    public static void main(String[] args) {
        int a = summe();
        System.out.println(a); 

    }
    public static int summe(){
        int a,b,summe;
        a = 10;
        b = 5;

        summe = a + b;

        return summe;
    }
}
