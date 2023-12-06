package DSÜbung;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Smartphone {
    private List<Kontakt> meineKontakte;

    public Smartphone(){
        meineKontakte = new ArrayList<Kontakt>();
    }
    public boolean addKontakt(Kontakt neuerKontakt){
        for(Kontakt kontaktListe : meineKontakte){
            if (neuerKontakt.getName().equals(kontaktListe.getName())){
                System.out.println("Kontakt bereits vorhanden");
                return false;
            }
        }
        meineKontakte.add(neuerKontakt);
        System.out.println("Kontakt wurde hinzugefügt!");
        return true;
    }
    public boolean findKontakt(String name){
        for (Kontakt kontaktInListe : meineKontakte) {
            if (Objects.equals(name, kontaktInListe.getName())) {
                System.out.println("Gefunden.." + "Name: " + kontaktInListe.getName() + "Tel: " + kontaktInListe.getTelefonNummer());
                return true;
            }
        }
            System.out.println("Nicht gefunden");
            return false;
    }
    public void ausgabe(){
        for (Kontakt kontaktliste : meineKontakte) {
            System.out.println("Kontakt: "+ kontaktliste.getName() + " Tel: " + kontaktliste.getTelefonNummer());
        }
    }

}
