package ChatGptTasks;

import java.util.List;

public class Bibliothek extends Buch {
    List<Buch> katalog;

    public Bibliothek(List katalog, String titel, String autor, String isbn, boolean ausgeliehen) {
        super(titel, autor, isbn, ausgeliehen);
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
                System.out.println(buch);
                buchGefunden = true;

            } else if (!buchGefunden) {
                System.out.println("Keine Bücher von " + gesuchterAutor + "gefunden.");
            }
        }
    }

    public void findIsbn(String isbn) {
        boolean buchGefunden = false;
        for (Buch buch : katalog) {
            if (buch.getIsbn().equals(isbn)) {
                System.out.println(buch);
                buchGefunden = true;
            } else if (!buchGefunden) {
                System.out.println("Keine Bücher mit der ISBN: " + isbn + "gefunden.");
            }
        }
    }
}