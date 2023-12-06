package OOP5;

public class GalaxyJ3 extends Samsung implements ITelefon {
    public GalaxyJ3(double preis, String produktTyp) {
        super(preis, produktTyp);
    }
    @Override
    public void powerOn() {
        System.out.println("Das Galaxy J3 wird eingeschaltet");

    }

    @Override
    public void esKlingelt() {
        System.out.println("Das Galaxy J3 klingelt");

    }

    @Override
    public void anrufen() {
        System.out.println("Das Galaxy J3 ruft an");

    }

}
