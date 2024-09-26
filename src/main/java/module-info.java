module org.example.proyectocalculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.proyectocalculadora to javafx.fxml;
    exports org.example.proyectocalculadora;
}