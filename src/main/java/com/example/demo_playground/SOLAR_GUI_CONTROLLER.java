package com.example.demo_playground;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class SOLAR_GUI_CONTROLLER {

    @FXML
    private Label SOLAR_GUI_TEXT;


    @FXML
    private Button button;


    @FXML
    public void displayStats(ActionEvent actionEvent) {
        System.out.println("Displaying stats...");
        SOLAR_GUI_TEXT.setText("SOLAR_GUI_TEXT has been set!");
    }

    @FXML
    public void handleButtonAction(ActionEvent actionEvent) {
        System.out.println("You clicked me!");


        button.setStyle("-fx-background-color: #ffcc46;");


        SOLAR_GUI_TEXT.setText("button response");
        SOLAR_GUI_TEXT.setStyle("-fx-background-color: #7fcc70;");

        //SOLAR_GUI_BAT.setText("bat");
        //SOLAR_GUI_BAT.setStyle("-fx-background-color: #7fcc70;");
    }


}