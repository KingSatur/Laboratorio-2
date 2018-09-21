package controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dataStructure.LinearStructure;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import model.Fortnite;
import model.Player;

public class FirstController implements Initializable {
	
	private Fortnite fornite;
	
    @FXML
    private Button rankPlayer;
    
    @FXML
    private Button seeSystem;
    
    @FXML
    private Button modePlataform;
    
    
    @FXML
    void modePlataform(ActionEvent event) throws IOException {
    	 
    	Parent root = FXMLLoader.load(getClass().getResource("/fxml/PlataformMode.fxml"));
        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("");
        stage.setResizable(false);
        stage.show();
    }
    
    @FXML
    void rankPlayer(ActionEvent event) throws IOException {
    	
    	Parent root = FXMLLoader.load(getClass().getResource("/fxml/RankedPlayer.fxml"));
        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Rank Player");
        stage.show();
    	
    	
    }
    
    @FXML
    void seeSystem(ActionEvent event) throws IOException {
    	
    	Parent root = FXMLLoader.load(getClass().getResource("/fxml/System.fxml"));
        Stage stage = new Stage();
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Nueva Ventana");
        stage.show();
    }

	public Fortnite getFornite() {
		return fornite;
	}

	public void setFornite(Fortnite fornite) {
		this.fornite = fornite;
	}
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		fornite = new Fortnite();
		
	}
    
    
    
}
