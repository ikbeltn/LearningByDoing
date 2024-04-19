package CollectionSet;

import java.util.*;

class Person{

    private int id;
    private String name;

    public Person (int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {

        // Wichtiger Unterschied zu List
        // In einem Set kann kein Element doppelt vorkommen, da jedes als einzigartig angesehen wird.

        // Klasse die ein Set implementiert
        // 1. TreeSet
        // 2. HashSet
        // 3. LinkedHashSet

        // Datenstrukturen erzeugen
        List<String> list1 = new ArrayList<>();

        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new HashSet<>();
        Set<String> set3 = new LinkedHashSet<>();

        // Dateneingabe
        //ArrayList
        list1.add("Abdu");
        list1.add("Enes");
        list1.add("Abdu");
        list1.add("Mohamed");
        list1.add("Yassin");

        // TreeSet
        set1.add("Abdu");
        set1.add("Enes");
        set1.add("Abdu");
        set1.add("Mohamed");
        set1.add("Yassin");

        Person p1 = new Person(1, "Chris");
        Person p2 = new Person(2, "Nancy");
        Person p3 = new Person(3, "Ronald");
        Person p4 = new Person(4, "Biden");

        // HashSet
        set2.add("Abdu");
        set2.add("Enes");
        set2.add("Abdu");
        set2.add("Mohamed");
        set2.add("Yassin");

        // LinkedHashSet
        set3.add("Abdu");
        set3.add("Enes");
        set3.add("Abdu");
        set3.add("Mohamed");
        set3.add("Yassin");

        // Datenausgabe
        System.out.println("Ausgabe ArrayList: ");
        Main.getElement(list1);
        System.out.println("\nAusgabe TreeSet: ");
        Main.getElement(set1);
        System.out.println("\nAusgabe HashSet: ");
        Main.getElement(set2);
        System.out.println("\nAusgabe LinkedHashSet: ");
        Main.getElement(set3);
    }

    public static void getElement(Collection<String> collection) {
        for (String element : collection) {
            System.out.println(element);
        }
    }
}
