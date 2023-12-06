package OOP5;

public interface ITelefon {
    //Eigenschaften / Attribute -> nur Konstanten
    public static final String NETZANBIETER = "Telekom";

    //Methodensignaturen / Methodenköpfe

    public abstract void powerOn();
    public abstract void esKlingelt();
    public abstract void anrufen();
}
