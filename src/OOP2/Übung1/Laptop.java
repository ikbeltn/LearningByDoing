package OOP2.Übung1;

public class Laptop {
    String marke;
    int ram;
    String cpu;
    double preis;

    public Laptop (String marke, int ram, String cpu, double preis){
        this.marke = marke;
        this.ram = ram;
        this.cpu = cpu;
        this.preis = preis;
    }

    public void starten (){
        System.out.println("Der Laptop " + this.marke + " wurde gestartet");
    }
}
