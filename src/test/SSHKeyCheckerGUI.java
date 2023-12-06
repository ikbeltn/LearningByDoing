package test;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class SSHKeyCheckerGUI extends Application {

    private Label statusLabel;
    private File selectedFile;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Label mit dem Namen und Link erstellen
        Label nameLabel = new Label("© Mohamed Ikbel Alkesibi");
        Hyperlink emailLink = new Hyperlink("mohamedikbel.alkesibi@ruv.de");
        emailLink.setOnAction(e -> {
            String email = emailLink.getText();
            // Hier kannst du Code einfügen, um eine E-Mail zu öffnen
            try {
                Desktop.getDesktop().mail(new URI("mailto", email, null));
            } catch (IOException | URISyntaxException x) {
                x.printStackTrace();
            }
        });
        VBox nameBox = new VBox(nameLabel, emailLink);
        nameBox.setAlignment(Pos.BOTTOM_RIGHT);
        nameBox.setSpacing(5);
        nameBox.setPadding(new Insets(0, 10, 10, 0));


        // Logo-Datei einbinden
        Image logoImage = new Image("test/logo.png");
        ImageView logoImageView = new ImageView(logoImage);
        logoImageView.setFitWidth(200);
        logoImageView.setPreserveRatio(true);

        // GUI-Elemente erstellen
        BorderPane root = new BorderPane();
        VBox vbox = new VBox();
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10));
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        root.setCenter(vbox);
        root.setBottom(hbox);
        root.setStyle("-fx-background-color: white");
        Label titleLabel = new Label("SSH Key Checker");
        titleLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        titleLabel.setTextFill(Color.web("#001957"));

        // Erzeuge einen neuen HBox-Knoten für nameBox
        HBox nameBoxContainer = new HBox(nameBox);
        nameBoxContainer.setAlignment(Pos.BOTTOM_RIGHT);

        Button uploadButton = new Button("Datei hochladen");
        uploadButton.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            selectedFile = fileChooser.showOpenDialog(primaryStage);
            if (selectedFile != null) {
                statusLabel.setText(selectedFile.getName() + " wurde ausgewählt.");
            }
        });

        Button checkButton = new Button("Check");
        checkButton.setOnAction(event -> {
            if (selectedFile == null) {
                statusLabel.setText("Bitte eine Datei auswählen.");
                statusLabel.setTextFill(Color.web("#ff0000"));
                return;
            }

            Path filePath = Paths.get(selectedFile.getPath());
            try {
                List<String> lines = Files.readAllLines(filePath);
                if (lines.size() != 1) {
                    statusLabel.setText("Die Datei enthält nicht genau eine Zeile.");
                    statusLabel.setTextFill(Color.web("#ff0000"));
                    if (!lines.get(0).startsWith("ssh-ed25519 ")) {
                        statusLabel.setText(statusLabel.getText() + "\nDie Datei enthält keinen gültigen ed25519 SSH-Schlüssel.");
                        statusLabel.setTextFill(Color.web("#ff0000"));
                    }
                    return;
                }

                String line = lines.get(0);
                if (!line.startsWith("ssh-ed25519 ")||!line.startsWith("ssh-rsa ")) {
                    statusLabel.setText("Die Datei enthält keinen gültigen ed25519 SSH-Schlüssel.");
                    statusLabel.setTextFill(Color.web("#ff0000"));
                    return;
                }

                statusLabel.setText("Die Datei enthält einen gültigen ed25519 SSH-Schlüssel und kann systemweit verteilt werden.");
                statusLabel.setTextFill(Color.web("green"));
            } catch (IOException e) {
                statusLabel.setText("Fehler beim Lesen der Datei: " + e.getMessage());
                statusLabel.setTextFill(Color.web("#ff0000"));
            }
        });


        statusLabel = new Label();
        statusLabel.setFont(Font.font("Arial", FontWeight.NORMAL, 14));
        statusLabel.setTextFill(Color.web("#0076a3"));


        hbox.getChildren().addAll(uploadButton, checkButton);
        vbox.getChildren().addAll(logoImageView, titleLabel, statusLabel);
        hbox.getChildren().add(nameBox);












        // Fenster erstellen
        Scene scene = new Scene(root, 1280, 720);


        primaryStage.setTitle("SSH Key Checker");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


}
