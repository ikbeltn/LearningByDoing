package OOP1;

public class Auto {
    //Eigenschaften / Attribute
    int reifen;
    int preis;
    String marke;

    public Auto() {
    }

    public Auto(int reifen, int preis, String marke) {
        this.reifen = reifen;
        this.preis = preis;
        this.marke = marke;
    }

    public void gasgeben(){
        System.out.println("Das Auto mit der Marke " + this.marke + " gibt gas");
    }

    public void bremsen(){
        System.out.println("Das Auto mit der Marke " + this.marke + " bremst!");
    }

    public void vergleichePreis(int preis){
        if (this.preis <= preis){
            System.out.println("Der " + this.marke + " ist günstiger als " + preis);
        } else {
            System.out.println("Der " + this.marke + " ist teurer als " + preis);
        }
    }

}

