package OOP3.Übung1;

public class Auto {
    String autoMarke;
    Reifen reifen;

    public Auto(){

    }
    public Auto (String autoMarke, String reifenMarke, String reifenTyp){
        this.autoMarke = autoMarke;
        reifen = new Reifen(reifenMarke, reifenTyp);
    }
    public void ausgabeDaten(){
        System.out.println("Die Automarke ist: " + this.autoMarke + " und der Reifentyp ist: " + this.reifen.reifenTyp);
    }

}
