package org.example.proyectocalculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

/**
 * Controlador de la calculadora.
 * Maneja la lógica de la interfaz gráfica para realizar operaciones matemáticas básicas.
 */
public class HelloController {

    @FXML
    private RadioButton rb_dividir;

    @FXML
    private RadioButton rb_multiplicar;

    @FXML
    private RadioButton rb_restar;

    @FXML
    private RadioButton rb_sumar;

    @FXML
    private TextField txtOp1;

    @FXML
    private TextField txtOp2;

    @FXML
    private TextField txtResult;

    /**
     * Método que realiza el cálculo basado en la operación seleccionada.
     * Se activa al presionar el botón de calcular.
     * @param event Evento que representa la acción de hacer clic en el botón calcular.
     */
    public void calcular(ActionEvent event) {
        try {
            // Obtener los operandos desde los campos de texto
            double op1 = Double.parseDouble(this.txtOp1.getText());
            double op2 = Double.parseDouble(this.txtOp2.getText());

            // Crear una instancia de la clase Operaciones con los operandos
            Operaciones operaciones = new Operaciones(op1, op2);

            // Verificar qué operación ha sido seleccionada y realizar la correspondiente
            if (this.rb_sumar.isSelected()) {
                this.txtResult.setText(operaciones.sumar() + "");
            } else if (this.rb_restar.isSelected()) {
                this.txtResult.setText(operaciones.restar() + "");
            } else if (this.rb_multiplicar.isSelected()) {
                this.txtResult.setText(operaciones.multiplicar() + "");
            } else if (this.rb_dividir.isSelected()) {
                if (op2 == 0) {
                    // Mostrar un mensaje de error si el segundo operando es 0 en la división
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setHeaderText(null);
                    alert.setTitle("Error");
                    alert.setContentText("El operando 2 no puede ser 0");
                    alert.showAndWait();
                } else {
                    this.txtResult.setText(operaciones.dividir() + "");
                }
            }
        } catch (NumberFormatException e) {
            // Capturar errores en el formato de los operandos (por ejemplo, si no son números válidos)
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }
    }
}
