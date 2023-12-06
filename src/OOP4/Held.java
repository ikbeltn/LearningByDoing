package OOP4;

public class Held {
    private String name;
    private int lebenspunkte;

    public Held(int lebenspunkte) {
        if (lebenspunkte <= 100 && lebenspunkte > 0) {
            this.lebenspunkte = lebenspunkte;
        }
    }

    public void getLebenspunkte() {
        System.out.println(this.lebenspunkte);
    }

    public void setLebenspunkte(int schaden) {
        this.lebenspunkte -= schaden;
        System.out.println(this.lebenspunkte);
    }

}
