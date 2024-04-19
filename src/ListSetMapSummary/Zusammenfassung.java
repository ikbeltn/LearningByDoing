package ListSetMapSummary;

import java.util.*;

public class Zusammenfassung {

    public static void main(String[] args) {

        // Strukturen:

        // List / Liste --> Einkaufsliste
        List<String> list = new ArrayList<>();

        list.add("Katze");
        list.add("Hund");
        list.add("Maus");
        list.add("Elefant");

        //sort Methode um Listen zu sortieren
        Collections.sort(list);

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("\n");

        // Set / Menge --> Schublade voll mit Elementen --> kein doppeltes Element
        // TreeSet um Set zu sortieren
        Set<String> set = new TreeSet<>();

        set.add("Katze");
        set.add("Hund");
        set.add("Maus");
        set.add("Elefant");

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("\n");

        // Map / Verbindung zwischen 2 Elementen --> Artikel hat eine einzigartige Artikelnummer
        // TreeMap sortiert nach Schlüsseln
        Map<Integer, String> map = new TreeMap<>();

        map.put(1,"Katze");
        map.put(2,"Hund");
        map.put(3,"Maus");
        map.put(4,"Elefant");

        for (Integer i : map.keySet()) {
            System.out.println(map.get(i));
        }
        System.out.println("\n");
    }

    public static void addElements(int anzPerson)

}
