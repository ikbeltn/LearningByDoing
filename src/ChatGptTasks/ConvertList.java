package ChatGptTasks;

import java.util.*;

public class ConvertList {
    List<Integer> zahlenListe = new ArrayList<>();
    List<Integer> zahlenListeLinked;
    Random random = new Random();

    public void add() {
        for (int i = 1; i <= 5; i++) {
            zahlenListe.add(i);
        }
        System.out.println("ArrayList nach Hinzufügen: " + zahlenListe);
    }

    public void remove() {
        zahlenListe.remove(1);
        System.out.println("ArrayList nach Entfernen: " + zahlenListe);
    }

    public void convert() {
        zahlenListeLinked = new LinkedList<>(zahlenListe);
    }

    public int randomInt() {
        return random.nextInt(10);
    }

    public void insert() {
        zahlenListeLinked.add(1, randomInt());
    }

    public void output() {
        System.out.println("LinkedList: " + zahlenListeLinked);
    }

    public static void main(String[] args) {
        ConvertList cl = new ConvertList();
        cl.add();
        cl.remove();
        cl.convert();
        cl.insert();
        cl.output();
    }
}
