module org.example.app_gestion {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens app to javafx.fxml;
    exports app;
    exports database;
    opens database to javafx.fxml;
    exports controllers;
    opens controllers to javafx.fxml;
}