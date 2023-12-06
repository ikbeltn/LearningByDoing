package OOP5;

public abstract class Samsung {
    //Eigenschaften/Attribute
    private double preis;
    private String produktTyp;
    //Konstruktor


    public Samsung() {
    }
    public Samsung(double preis, String produktTyp) {
        super();
        this.setPreis(preis);
        this.setProduktTyp(produktTyp);
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public String getProduktTyp() {
        return produktTyp;
    }

    public void setProduktTyp(String produktTyp) {
        this.produktTyp = produktTyp;
    }
}
