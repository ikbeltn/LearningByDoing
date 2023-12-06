package OOP2;

public class Tier {
    String name;
    int gewicht;
    int größe;

    public Tier(String name, int gewicht, int größe){
        this.name = name;
        this.gewicht = gewicht;
        this.größe = größe;
    }
    public void essen(){
        System.out.println("Das Tier isst");
    }
}
