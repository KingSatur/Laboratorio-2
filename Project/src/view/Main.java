package view;
	
import java.io.IOException;

import controller.ControllerSystem;
import controller.FirstController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Main extends Application {
	
	private FirstController firstController;
	private ControllerSystem controllerSystem;
	
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/Interfaz.fxml"));
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Interfaz.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Fortnite");
		primaryStage.show();
		firstController = new FirstController();
		
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}