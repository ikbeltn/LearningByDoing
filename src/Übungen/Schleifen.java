package Übungen;

public class Schleifen {
    public static void main(String[] args) {

        int loop = 0;

        while (loop != 20) {
            System.out.println("Loop started");
            if (loop != 20) {
                loop++;
                System.out.println("Looping..." + loop);
            }else {
                System.out.println("Loop ended");
                break;
            }
        }
    }
}
