package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import model.Player;

public class ControllerSystem implements Initializable{
	
    @FXML
    private ComboBox<String> comboRanking;
    private ObservableList<String> lista;
    @FXML
    private TableView mainTable;
    private ObservableList<Player> listPlayers;
   

    
    @FXML
    public void initalize() {
    	setColumns();
    	lista = FXCollections.observableArrayList("EXCELENT_SKILL_AND_GOOD_LATENCE", "EXCELENT_SKILL_AND_MEDIUM_LATENCE" , "EXCELENT_SKILL_AND_BAD_LATENCE" ,
    			"EXCELENT_SKILL_AND_PESSIMUM_LATENCE" , "GOOD_SKILL_AND_GOOD_LATENCE" , "GOOD_SKILL_AND_MEDIUM_LATENCE" , "GOOD_SKILL_AND_BAD_LATENCE", 
    			"GOOD_SKILL_AND_PESSIMUM_LATENCE" , "MEDIUM_SKILL_AND_GOOD_LATENCE" , "MEDIUM_SKILL_AND_MEDIUM_LATENCE" , "MEDIUM_SKILL_AND_BAD_LATENCE",
    			"MEDIUM_SKILL_AND_PESSIMUM_LATENCE", "BAD_SKILL_AND_GOOD_LATENCE" , "BAD_SKILL_AND_MEDIUM_LATENCE" , "BAD_SKILL_AND_BAD_LATENCE" ,
    			"BAD_SKILL_AND_PESSIMUM_LATENCE", "PESSIMUM_SKILL_AND_GOOD_LATENCE", "PESSIMUM_SKILL_AND_MEDIUM_LATENCE" , "PESSIMUM_SKILL_AND_BAD_LATENCE",
    			"PESSIMUM_SKILL_AND_PESSIMUM_LATENCE");
    	comboRanking.setItems(lista);	
    }
    
    werwerewrewr
    qwewqewqewee
    @FXML
    void comboPressed(ActionEvent event) {
    	System.out.println(comboRanking.getValue());
    	insertColumns();
    }

    
    public void setColumns() { 	
    	TableColumn name = new TableColumn("Name");
    	name.setCellValueFactory(new PropertyValueFactory<Player, String>("name"));
    	TableColumn latence = new TableColumn("Skill");
    	latence.setCellValueFactory(new PropertyValueFactory<Player, String>("latence"));
    	TableColumn skill = new TableColumn("Latence");
    	skill.setCellValueFactory(new PropertyValueFactory<Player, String>("skill"));
    	mainTable.getColumns().addAll(name, latence, skill);
    }
    
    public void insertColumns() {
    	mainTable.setEditable(true);
    	listPlayers = FXCollections.observableArrayList();
    	listPlayers.clear();
    	Player p1 = new Player("Juanda", 100, 40, 70, 100, 30, 20, 40, 5);
    	Player p2 = new Player("Leo", 200, 40, 70, 100, 30, 20, 40, 5);
    	Player p3 = new Player("Pat324ron", 300, 40, 70, 100, 30, 20, 40, 5);
    	Player p4 = new Player("Juanda32", 100, 40, 70, 100, 30, 20, 40, 5);
    	Player p5 = new Player("Lewero", 200, 40, 70, 100, 30, 20, 40, 5);
    	Player p6 = new Player("Patrewron", 300, 40, 70, 100, 30, 20, 40, 5);
    	Player p7 = new Player("Juandwera", 100, 40, 70, 100, 30, 20, 40, 5);
    	Player p8 = new Player("Lewero", 200, 40, 70, 100, 30, 20, 40, 5);
    	Player p9 = new Player("Patrweron", 300, 40, 70, 100, 30, 20, 40, 5);
    	Player p10 = new Player("Juandwera", 100, 40, 70, 100, 30, 20, 40, 5);
    	Player p11 = new Player("Lewero", 200, 40, 70, 100, 30, 20, 40, 5);
    	Player p12 = new Player("Patrweron", 300, 40, 70, 100, 30, 20, 40, 5);
    	Player p13 = new Player("Patr12312312312323ron", 300, 40, 70, 100, 30, 20, 40, 5);
    	listPlayers.addAll(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12, p13);
    	mainTable.setItems(listPlayers);
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initalize();
	}
	
	
	
	
	
	
    
	
	
	

}
