package sample.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class TelaJogo {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView agenteCarta2;

    @FXML
    private AnchorPane jogCarta2;

    @FXML
    void initialize() {
        assert agenteCarta2 != null : "fx:id=\"agenteCarta2\" was not injected: check your FXML file 'TelaJogo.fxml'.";
        assert jogCarta2 != null : "fx:id=\"jogCarta2\" was not injected: check your FXML file 'TelaJogo.fxml'.";

    }

}
