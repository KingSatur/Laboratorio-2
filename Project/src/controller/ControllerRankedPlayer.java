package controller;

import javax.swing.JOptionPane;

import exceptions.FailureToEnterValuesException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControllerRankedPlayer {

    @FXML
    private TextField nameField;

    @FXML
    private TextField levelField;

    @FXML
    private TextField habilityLeveField;

    @FXML
    private TextField latenceField;

    @FXML
    private Button create;

    @FXML
    void toCreate(ActionEvent event) {
        
    	try {
    		if(verify()) {
//    			Player m = new Player(Integer.parseInt(levelfield.ge), int habilitieLevel, String name, double latence)
    		}
    	}
    	catch(FailureToEnterValuesException e) {
    		JOptionPane.showMessageDialog(null, e.getMessage());
    	}
    	
    }
    
    public boolean verify()throws FailureToEnterValuesException  {
    	
    	boolean well = false;
    	
    	if(nameField.getText().equals("") || levelField.getText().equals("") || habilityLeveField.getText().equals("") || latenceField.getText().equals("")) {
    		throw new FailureToEnterValuesException("No introdujo bien los datos");
    	}
    	else {
    		well = true;
    	}
    
    	return well;
    }

	
	
	
}
