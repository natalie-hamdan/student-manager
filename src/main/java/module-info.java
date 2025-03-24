module sample.studentmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.studentmanager to javafx.fxml;
    exports sample.studentmanager;
}