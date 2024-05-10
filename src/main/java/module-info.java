module com.example.hh {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.hh to javafx.fxml;
    exports com.example.hh;
}