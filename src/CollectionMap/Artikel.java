package CollectionMap;

import javafx.scene.image.Image;

public class Artikel {

	private String artikelName;
	private Image artikelBild;

	public Artikel(String artikelName, String artikelBild) {
		this.artikelName = artikelName;
		this.artikelBild = new Image(artikelBild);
	}

	public Image getArtikelBild() {
		return artikelBild;
	}

	public void setArtikelBild(Image artikelBild) {
		this.artikelBild = artikelBild;
	}

	public String getArtikelName() {
		return artikelName;
	}

	public void setArtikelName(String artikelName) {
		this.artikelName = artikelName;
	}

}
