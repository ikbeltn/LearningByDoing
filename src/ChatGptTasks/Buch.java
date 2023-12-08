package ChatGptTasks;

public class Buch {
    private String titel;
    private String autor;
    private String isbn;

    private boolean ausgeliehen;

    public Buch (String titel, String autor, String isbn, boolean ausgeliehen){
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
        this.ausgeliehen = ausgeliehen;
    }

    public void setTitel (String titel){
        this.titel = titel;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAusgeliehen(boolean ausgeliehen) {
        this.ausgeliehen = ausgeliehen;
    }

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAusgeliehen() {
        return ausgeliehen;
    }

    @Override
    public String toString() {
        return "Buch{" +
                "titel='" + titel + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", ausgeliehen=" + ausgeliehen +
                '}';
    }


}
