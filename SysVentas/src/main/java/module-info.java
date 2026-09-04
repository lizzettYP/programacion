module pe.edu.epeu.sysventas {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens pe.edu.epeu.sysventas to javafx.fxml;
    exports pe.edu.epeu.sysventas;
}