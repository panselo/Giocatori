module com.example.giocatori {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.giocatori to javafx.fxml;
    exports com.example.giocatori;
}