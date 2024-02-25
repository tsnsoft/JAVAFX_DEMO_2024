package kz.tsnsoft.javafx_demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javax.swing.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onJavaClick(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Hello, JavaFX!");
    }
}