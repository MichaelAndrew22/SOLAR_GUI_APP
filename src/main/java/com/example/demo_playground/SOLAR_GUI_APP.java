package com.example.demo_playground;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class SOLAR_GUI_APP extends Application {
    @Override
    public void start(Stage stage) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        FXMLLoader fxmlLoader = new FXMLLoader(SOLAR_GUI_APP.class.getResource("SOLAR_GUI.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 420, 420);


        stage.setOpacity(0.8);
        StageStyle stageStyle = StageStyle.UNDECORATED;
        stage.initStyle(stageStyle);
        stage.setTitle("SOLAR UI");
        stage.setAlwaysOnTop(true);
        stage.setResizable(true);



        stage.setScene(scene);
        stage.show();

    }




    public static void main(String[] args) {launch();}
}