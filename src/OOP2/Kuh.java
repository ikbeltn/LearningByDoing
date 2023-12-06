package OOP2;

public class Kuh extends Tier{
    int hufe;

    public Kuh(String name, int gewicht, int größe, int hufe){
        super(name, gewicht, größe);
        this.hufe = hufe;

    }

    @Override
    public void essen() {
        System.out.println("Die kuh muss das Essen immer wiederkauen");
        super.essen();

    }
}
