package CollectionMap;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class Lager extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		Artikel schrank1 = new Artikel("SchrankJuhu", "Schrank.png");
		Artikel regal1 = new Artikel("RegalJuhu", "Regal.png");

		Map<Integer, Artikel> lagerHalle = new HashMap<>();
		lagerHalle.put(1234, schrank1);
		lagerHalle.put(2345, regal1);

		ImageView imgSchrank = new ImageView(lagerHalle.get(1234).getArtikelBild());
		ImageView imgRegal = new ImageView(lagerHalle.get(2345).getArtikelBild());

		Button button1 = new Button("Zeige!");

		HBox layout = new HBox();
		layout.getChildren().add(button1);

		button1.setOnAction((event) -> {
			layout.getChildren().add(imgSchrank);
			layout.getChildren().add(imgRegal);
		});

		Scene scene = new Scene(layout, 200, 150);
		primaryStage.setScene(scene);
		primaryStage.show();

	}

}
