package DSÜbung;

public class Wetter {
    public String name;
    public int temperatur;
    public int luftfeuchtigkeit;
public Wetter (String name, int temperatur, int luftfeuchtigkeit){
    this.name = name;
    this.temperatur = temperatur;
    this.luftfeuchtigkeit = luftfeuchtigkeit;
}

    public static Wetter erstelleWetter(String name, int temperatur, int luftfeuchtigkeit){
        return new Wetter(name, temperatur, luftfeuchtigkeit);
    }

    public String getName() {
        return name;
    }

    public int getTemperatur() {
        return temperatur;
    }

    public int getLuftfeuchtigkeit() {
        return luftfeuchtigkeit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTemperatur(int temperatur) {
        this.temperatur = temperatur;
    }

    public void setLuftfeuchtigkeit(int luftfeuchtigkeit) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
    }
}

