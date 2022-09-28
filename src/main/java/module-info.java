module com.example.hbox_try {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hbox_try to javafx.fxml;
    exports com.example.hbox_try;
}