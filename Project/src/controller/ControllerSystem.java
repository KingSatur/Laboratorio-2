package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;

public class ControllerSystem implements Initializable{
	
    @FXML
    private ComboBox<String> comboRanking;
    private ObservableList<String> lista;
   
   
  
    @FXML
    void comboPres(MouseEvent event) {
    }
    
    @FXML
    public void initalize() {
    	lista = FXCollections.observableArrayList("1) Excelent skill and good latence", "2) Excelent skill and medium latence" , " 3) Excelent skill and bad latence" ,
    			"4) Excelent skill and pessimum latence" , "5) Good skill and good latence" , "6) Good skill and medium latence" , "7) Good skill and bad latence", 
    			"8) Good skill and pessimum latence" , "9) Medium skill and good latence" , "10) Medium skill and medium latence" , "11) Medium skill and bad latence",
    			"12) Medium skill and pessimum latence", "13) Bad skill and good latence" , "14) Bad skill and medium latence" , "15) Bad skill and bad latence" ,
    			"16) Bad skill and pessimum latence", "17) Pessimum skill and good latence", "18) Pessimum skill and medium latence" , "19) Pessimum skill and bad latence",
    			"20) Pessimum skill and pessimum latence");
    	comboRanking.setItems(lista);
    	
    	%$43524523532432432432432
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initalize();
		
	}
    
	
	
	

}
