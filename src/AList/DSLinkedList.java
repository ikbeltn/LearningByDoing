package AList;

import java.util.*;

public class DSLinkedList {
    public static void main(String[] args) {
        List<Integer> liste = new LinkedList<>();

        for (int i = 0; i < 10000000; i++) {
            liste.add(i);
        }
        final long timeStart = System.currentTimeMillis(); // Startzeit merken
        DSLinkedList.getZahl(1999999, liste);
        final long timeEnd = System.currentTimeMillis(); // Endzeit merken
        System.out.println("Laufzeit: " + (timeEnd - timeStart) + " ms");
    }

    public static void getZahl(int index,List<Integer> liste) {
        System.out.println(liste.get(index));
    }
}
