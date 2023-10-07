package com.example.demo_playground;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
public class SOLAR_GUI_APP extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SOLAR_GUI_APP.class.getResource("SOLAR_GUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 420);
        stage.setTitle("SOLAR UI");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}