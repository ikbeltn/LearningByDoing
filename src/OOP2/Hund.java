package OOP2;

public class Hund extends Tier{
    //Eigenschaften
int zähne;

    public Hund(String name, int größe, int gewicht, int zähne){
        super(name, größe, gewicht);
        this.zähne = zähne;

    }
    public void zähne(){

    }

    @Override
    public void essen() {
        System.out.println("Der Hund muss noch sein Essen kauen");
        super.essen();
    }
}
