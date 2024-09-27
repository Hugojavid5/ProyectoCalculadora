package org.example.proyectocalculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("/org.example.proyectocalculadora/calculadora.fxml"));
            Scene scene = new Scene(root,400,400);
            scene.getStylesheets().add(getClass() .getResource("/css/application.css").toExternalForm());
            primaryStage.setTitle("CALCULADORA");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}