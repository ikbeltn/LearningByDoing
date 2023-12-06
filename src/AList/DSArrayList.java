package AList;

import java.util.ArrayList;

public class DSArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ArrayList = "Wie ein Array nur dynamisch"
		 * 
		 * Was sind die Set überhaupt
		 *  Dienen zu  Zwischenspeicherung von Daten
		 */
		
			// Eine ArrayList erstellen:
		ArrayList einkaufsListe;
		einkaufsListe = new ArrayList();
		ArrayList<String> namensListe = new ArrayList<String>();

		// Dateneingabe:
		einkaufsListe.add("Wasser");
		einkaufsListe.add("Brot");
		//einkaufsListe.add(new Integer(4));
		
		namensListe.add("Hans");
		namensListe.add("Peter");
		//namensListe.add(new Double(4.5));
		
			// Datenausgabe (mehrere Möglichkeiten):
		for (int i = 0; i < namensListe.size(); i++) {
			System.out.println("Name:" + namensListe.get(i));
		}
		
			for (String string : namensListe) {
			System.out.println("Die Länge des Namnes ist: " + string.length());
		}
	}
}
