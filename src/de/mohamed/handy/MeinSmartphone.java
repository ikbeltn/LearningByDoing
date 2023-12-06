package de.mohamed.handy;

import DSÜbung.*;

public class MeinSmartphone {
    public static void main(String[] args) {

        Smartphone iPhone6 = new Smartphone();

        iPhone6.addKontakt(Kontakt.erstelleKontakt("Polizei", "0611 110"));
        iPhone6.addKontakt(Kontakt.erstelleKontakt("Feuerwehr", "0611 112"));

        Kontakt petra = new Kontakt("Petra", "0611 12345");
        iPhone6.addKontakt(petra);

        iPhone6.ausgabe(); 
    }

}
