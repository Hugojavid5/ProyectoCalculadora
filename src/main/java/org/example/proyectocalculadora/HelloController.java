package org.example.proyectocalculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.awt.event.ActionEvent;

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

    // Event Listener on Button.onAction
    @FXML
    public void calcular(ActionEvent event) {
        try {
            double op1 = Double.parseDouble(this.txtOp1.getText());
            double op2 = Double.parseDouble(this.txtOp2.getText());
            Operaciones operaciones = new Operaciones(op1, op2);
            if (this.rb_sumar.isSelected()) {
                this.txtResult.setText(operaciones.sumar() + "");
            } else if (this.rb_restar.isSelected()) {
                this.txtResult.setText(operaciones.restar() + "");
            } else if (this.rb_multiplicar.isSelected()) {
                this.txtResult.setText(operaciones.multiplicar() + "");
            } else if (this.rb_dividir.isSelected()) {
                if (op2 == 0) {
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
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Formato incorrecto");
            alert.showAndWait();
        }
    }
}