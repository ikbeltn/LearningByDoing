package Übungen;

public class Arrays2 {
    public static void main(String[] args) {

        int[] lottozahlen = new int[6]; // Array mit 6 Elementen erstellt

        for (int i = 0; i < lottozahlen.length; i++) {
            lottozahlen[i] = (int) (Math.random() * 49 + 1);
            System.out.println(lottozahlen[i]);
        }
    }
}
