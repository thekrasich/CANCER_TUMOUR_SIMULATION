module skms.pisar.tumour_simulation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens skms.pisar.tumour_simulation to javafx.fxml;
    exports skms.pisar.tumour_simulation;
}