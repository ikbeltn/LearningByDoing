package CollectionSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSetList {
    public static void main(String[] args) {

        // Erstellen einer neuen ArrayList, namens "list1"
        List<String> list1 = new ArrayList<>();

        // Elemente hinzufügen zu list1
        list1.add("Zala");
        list1.add("Mohamed");
        list1.add("Abdullahi");
        list1.add("Yassin");
        list1.add("Boris");
        list1.add("Mohamed");

        // Iteriert durch die Liste "list1"
        for (String string : list1) {
            System.out.println(string);
        }

        // Sortiert mit Collection Framework Methode "sort", die ArrayList "list1".
        Collections.sort(list1);

        // Neue Zeile & Print mit "Sortiert"
        System.out.println("\nSortiert");
        // Iteriert durch list1 und speichert in string & Print von jedem Element
        for (String string : list1) {
            System.out.println(string);
        }
    }
}