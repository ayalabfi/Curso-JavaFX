module com.educandoweb.javafx2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    exports com.educandoweb.javafx2.application;
    opens com.educandoweb.javafx2.application to javafx.fxml;
    opens com.educandoweb.javafx2.controller to javafx.fxml;
}