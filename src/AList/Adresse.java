package AList;

public class Adresse {

	// Eigenschaften / Attribute
	private String name;
	private String strasse;
	private String stadt;

	// Konstruktor
	public Adresse() {
		this("","","");
	}

	public Adresse(String name, String strasse, String stadt) {
		//super();
		this.name = name;
		this.strasse = strasse;
		this.stadt = stadt;
	}

	// Methoden
	public String getStadt() {
		return stadt;
	}

	public void setStadt(String stadt) {
		this.stadt = stadt;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
