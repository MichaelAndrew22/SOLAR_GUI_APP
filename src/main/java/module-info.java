module com.example.demo_playground {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_playground to javafx.fxml;
    exports com.example.demo_playground;
}