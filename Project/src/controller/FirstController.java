package controller;

import java.io.IOException;

import dataStructure.AlbertList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Player;

public class FirstController {
	
	private AlbertList<Player> mainList;
	
    @FXML
    private Button rankPlayer;
    
    @FXML
    private Button seeSystem;
    
    @FXML
    private Button modePlataform;
    
    @FXML
    void modePlataform(ActionEvent event) throws IOException {
    	 
    	Parent root = FXMLLoader.load(getClass().getResource("Second.fxml"));
        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane);

        stage.setScene(scene);
        stage.setTitle("Nueva Ventana");
        stage.show();
    }
    
    @FXML
    void rankPlayer(ActionEvent event) {
    	
    	
    	
    }
    
    @FXML
    void seeSystem(ActionEvent event) {
    	
    	
    	
    }
    
    
}
