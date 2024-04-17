package CollectionMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Was ist ein Assoziativspeicher? Assoziation = hat Beziehung
        // Der Inhalt hat eine "Beziehung" zum Schlüssel

        // Jeder Inhalt hat eine "Beziehung" zum Schlüssel
        // Es gibt keine doppelten Schlüssel, sonst wird der alte überschrieben

        // K = Key = Schlüssel --> Objekte
        // V = Value = Wert = Inhalt

        Map<Integer,String> map1 = new HashMap<>();

        map1.put(1234, "Lambo Diablo GT");
        map1.put(4321, "Kuku Kiki Kaka");

        for (Integer i : map1.keySet()) {
            System.out.println("Der Schlüssel lautet: " + i);
            System.out.println("Der dazugehörige Inhalt ist: " + map1.get(i) + "\n");
        }
    }
}
