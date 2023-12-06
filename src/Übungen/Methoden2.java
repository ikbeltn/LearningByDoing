package Übungen;

public class Methoden2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            erstelleGegner2("Manyak", 100);
        }
    }

    public static void erstelleGegner(){
        String name = "Ferdaus";
        int leben = 100;
        System.out.println("Gegner " + name + " mit " + leben + " Leben erstellt");
    }
    public static void erstelleGegner2(String name, int leben){
        String gegnerName = name;
        int gegnerLeben = leben;
        System.out.println("Gegner " + gegnerName + " mit " + gegnerLeben + " Leben erstellt");
    }
}
