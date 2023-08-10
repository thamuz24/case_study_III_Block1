module com.example.case_study {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.case_study to javafx.fxml;
    exports com.example.case_study;

}