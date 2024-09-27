package org.example.proyectocalculadora;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Clase principal que lanza la aplicación JavaFX.
 * Esta clase carga la interfaz de usuario desde un archivo FXML y crea una ventana para la calculadora.
 */
public class HelloApplication extends Application {

    /**
     * Método que inicia la aplicación JavaFX. Carga el archivo FXML y muestra la ventana de la calculadora.
     * @param primaryStage El escenario principal donde se mostrará la escena de la calculadora.
     * @throws IOException Si ocurre un error al cargar el archivo FXML.
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Cargar el archivo FXML que define la interfaz de usuario de la calculadora
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("calculadora.fxml"));
        // Crear una escena de tamaño 400x400 a partir del archivo FXML cargado
        Scene scene = new Scene(loader.load(), 400, 400);
        // Definir el título de la ventana
        primaryStage.setTitle("CALCULADORA");
        // Establecer la escena en el escenario principal
        primaryStage.setScene(scene);
        // Mostrar la ventana
        primaryStage.show();
    }

    /**
     * Método principal de la aplicación. Llama al método {@link Application#launch(String[])} para iniciar la aplicación.
     * @param args Argumentos de la línea de comandos (opcional).
     */
    public static void main(String[] args) {
        // Lanzar la aplicación JavaFX
        launch(args);
    }
}
