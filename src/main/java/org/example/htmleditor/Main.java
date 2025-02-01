package org.example.htmleditor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/org/example/css/fxml/editor.fxml"));
        Scene scene = new Scene(root);

        // Устанавливаем стили
        URL urlStylesheet = getClass().getResource("/org/example/css/styles.css");
        scene.getStylesheets().add(urlStylesheet.toExternalForm());

        primaryStage.setTitle("HTML Editor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}