package com.example.giocatori;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {

    Squadra sq = new Squadra("atalanta", "gasperini");
    @FXML
    private Label welcomeText;

    @FXML
    private TextField nome;

    @FXML
    private TextField cognome;

    @FXML
    private TextField goal;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void aggiungiGiocatore(){
        Giocatore g = new Giocatore(nome.getText(), Integer.parseInt(goal.getText()));
        sq.aggiuntaGiocatore(g);
    }

    @FXML
    private TextArea vis;

    @FXML
    protected void visualizzaRosa(){
        vis.setText(sq.visualizzaGiocatori());
    }
}