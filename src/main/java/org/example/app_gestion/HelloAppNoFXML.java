package org.example.app_gestion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloAppNoFXML extends Application {
    public void start(Stage stage) {
        Button btn = new Button("Haz clic");
        btn.setOnAction(e -> btn.setText("¡Hola!"));

        VBox root = new VBox(btn);
        Scene scene = new Scene(root, 300, 200);

        stage.setScene(scene);
        stage.setTitle("JavaFX sin FXML");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}