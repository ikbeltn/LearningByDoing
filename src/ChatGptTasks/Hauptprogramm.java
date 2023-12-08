package ChatGptTasks;

import java.util.ArrayList;

public class Hauptprogramm {
    public static void main(String[] args) {
        Bibliothek bibliothek = new Bibliothek(new ArrayList<>());

        // Bücher hinzufügen
        bibliothek.addBuch("1984", "George Orwell", "123456789", false);
        bibliothek.addBuch("Der Herr der Ringe", "J.R.R. Tolkien", "987654321", false);

        // Ein Buch suchen
        bibliothek.findBuch("George Orwell");

        // Ein Buch anhand der ISBN entfernen
        bibliothek.delBuch("123456789");

        // Versuchen, ein nicht vorhandenes Buch zu finden
        bibliothek.findIsbn("111111111");
    }
}
