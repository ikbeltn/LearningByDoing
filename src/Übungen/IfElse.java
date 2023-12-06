package Übungen;

public class IfElse {
    public static void main(String[] args) {

        int punkte = 700;
        boolean win = true;
        int leben = 1;

        if (punkte >= 800) {
            System.out.println("Herzlichen Glückwunsch, Sie haben den 1. Preis gewonnen!");
        } else {
            System.out.println("Leider haben Sie den 1. Preis nicht gewonnen!");
            win = false;
            leben -= 1;
        }



        if (win == true) {
            System.out.println("Sie haben: " +punkte+ " Punkte");
            leben += 1;
        } else {
            System.out.println("Leider haben Sie unter 800 Punkte");
        }
        System.out.println("Sie haben noch: " +leben+ " Leben");
    }
}
