package OOP2.Übung1;

public class MacBook extends Laptop{
    boolean touchBar;

    public MacBook (String marke, int ram, String cpu, double preis, boolean touchBar){
        super(marke, ram, cpu, preis);
        this.touchBar = touchBar;
    }

    @Override
    public void starten() {
        super.starten();
        System.out.println("MacBook startet");
    }
}
