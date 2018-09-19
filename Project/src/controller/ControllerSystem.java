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
    	lista = FXCollections.observableArrayList("1) Excelent skill and good latence", "2) Excelent skill and medium latence" , " 3) Excelent skill and bad latence" ,
    			"4) Excelent skill and pessimum latence" , "5) Good skill and good latence" , "6) Good skill and medium latence" , "7) Good skill and bad latence", 
    			"8) Good skill and pessimum latence" , "9) Medium skill and good latence" , "10) Medium skill and medium latence" , "11) Medium skill and bad latence",
    			"12) Medium skill and pessimum latence", "13) Bad skill and good latence" , "14) Bad skill and medium latence" , "15) Bad skill and bad latence" ,
    			"16) Bad skill and pessimum latence", "17) Pessimum skill and good latence", "18) Pessimum skill and medium latence" , "19) Pessimum skill and bad latence",
    			"20) Pessimum skill and pessimum latence");
    	comboRanking.setItems(lista);	
    }
    

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
