package ChatGptTasks;

import java.util.List;

public class Bibliothek {
    List<Buch> katalog;

    public Bibliothek(List katalog) {
        this.katalog = katalog;
    }

    public void addBuch(String titel, String autor, String isbn, boolean ausgeliehen) {
        Buch neuesBuch = new Buch(titel, autor, isbn, ausgeliehen);
        katalog.add(neuesBuch);
        /*
        Ich übergebe der ArrayList 'katalog' ein Buch-Objekt (Container), der alle Informtionen eines Buches enthält.
         */
    }

    public void delBuch(String isbn) {
        katalog.removeIf(buch -> buch.getIsbn().equals(isbn));
    }

    public void findBuch(String gesuchterAutor) {
        boolean buchGefunden = false;
        for (Buch buch : katalog) {
            if (buch.getAutor().equals(gesuchterAutor)) {
                System.out.println("Titel: " + buch.getTitel());
                buchGefunden = true;
            }
        }
        if (!buchGefunden) {
            System.out.println("Es existiert kein buch von dem Autor: " + gesuchterAutor);
        }
    }

    public void findIsbn(String isbn) {
        boolean buchGefunden = false;
        for (Buch buch : katalog) {
            if (buch.getIsbn().equals(isbn)) {
                System.out.println("Titel: " + buch.getTitel());
                buchGefunden = true;
            }
        }
        if (!buchGefunden) {
            System.out.println("Keine Bücher mit der ISBN: " + isbn + " gefunden.");
        }
    }
}