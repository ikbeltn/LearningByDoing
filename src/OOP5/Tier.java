package OOP5;

public abstract class Tier {
    //Eigenschaften
    String name;
    int gewicht;
    int größe;
    //Konstruktor
    public Tier(){
    }
    public Tier(String name, int gewicht, int größe){
        this.name = name;
        this.gewicht = gewicht;
        this.größe = größe;
    }
    //Methoden
    public abstract void essen();

    public abstract void atmen();
}
