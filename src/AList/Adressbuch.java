package AList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Adressbuch {


	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// Objekte erstellt
		Adresse peterAdresse = new Adresse("Peter", "Fritzlangen Str. 4", "Berlin");
		Adresse hansAdresse = new Adresse("Hans", "Berlinerstraße 6", "Leipzig");
		Adresse michaelAdresse = new Adresse("Michael", "Leipzigerstraße 40", "Hamburg");



		// Set
		List<Adresse> adressenListe = new ArrayList<>(); // Dynamisch
		Adresse [] adressenArray = {peterAdresse, hansAdresse, michaelAdresse}; // Statisch


		// Eingabe in Liste
		adressenListe.add(peterAdresse);
		adressenListe.add(hansAdresse);
		adressenListe.add(michaelAdresse);

		System.out.println("Geben Sie bitte einen Namen, eine Straße und eine Stadt ein: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String strasse = scanner.nextLine();
		String stadt = scanner.nextLine();

		Adresse adresse4 = new Adresse(name, strasse, stadt);
		adressenListe.add(adresse4);

		System.out.println("ArrayList");
		for (Adresse adresse : adressenListe) {
			System.out.println("Name: " + adresse.getName() + ',' + " Strasse: " + adresse.getStrasse() + ',' + " Stadt: " + adresse.getStadt());
		}

		System.out.println("Array");
		for (Adresse adresse : adressenArray) {
			System.out.println("Name: " + adresse.getName() + ',' + " Strasse: " + adresse.getStrasse() + ',' + " Stadt: " + adresse.getStadt());
		}
	}
}

