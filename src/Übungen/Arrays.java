package Übungen;

public class Arrays {
    public static void main(String[] args) {
        int[] birthday = new int[3]; // Array mit 3 Elementen erstellt
        birthday[0] = 21; // 1. Element deklariert
        birthday[1] = 06; // 2. Element deklariert
        birthday[2] = 2001; // 3. Element deklariert

        System.out.println(birthday[1]);

        String [] name = {"Mohamed", "Enes", "Yassin", "Marcel"}; // Array sofort mit Werten deklariert
        System.out.println(name[2] + " Wurde von " + name[3] + " belästigt");
    }
}

