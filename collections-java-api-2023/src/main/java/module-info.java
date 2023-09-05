module com.example.collectionsjavaapi2023 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.collectionsjavaapi2023 to javafx.fxml;
    exports com.example.collectionsjavaapi2023;
}