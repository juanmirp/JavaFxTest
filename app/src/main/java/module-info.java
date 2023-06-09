module com.javafx.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens com.javafx.test.app to javafx.fxml;
    exports com.javafx.test.app;
}