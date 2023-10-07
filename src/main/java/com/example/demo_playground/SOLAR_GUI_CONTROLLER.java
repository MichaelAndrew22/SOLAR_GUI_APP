package com.example.demo_playground;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class SOLAR_GUI_CONTROLLER {

    @FXML
    private Label SOLAR_GUI_TEXT;


    @FXML
    public void displayStats(ActionEvent actionEvent) {
        System.out.println("Displaying stats...");
        SOLAR_GUI_TEXT.setText("SOLAR_GUI_TEXT has been set!");
    }

}