module org.example.proyectocalculadora {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.proyectocalculadora to javafx.fxml;
    exports org.example.proyectocalculadora;
}