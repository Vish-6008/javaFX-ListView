package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

public class ListMainController implements Initializable {
	
	@FXML
	public Label myLabel;
	
	
	@FXML
	public ComboBox<String> combobox;
	
	@FXML
	public ListView<String>listview;
	
	
	ObservableList<String> list=FXCollections.observableArrayList("Abhishek","Sanjay","Vijay","Rushab");
	 
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//combobox.setItems(list);
	//listview.setItems(list);		//un-comment if u want to print all names
	
	//to select multiple options on list
	listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
	}
	public void comboChanged(ActionEvent event) {
		//myLabel.setText(combobox.getValue());			//get all existing names or data by clicking combochanged
		
		combobox.getItems().addAll("manju","vishal","amrut"); 
	}
	
	public void buttonAction(ActionEvent event) {
		//myLabel.setText(combobox.getValue());			//get all existing names or data
		
		//listview.getItems().addAll("manju","vishal");	//get new list or data by clicking buttonAction
		
		ObservableList<String>names;
		names=listview.getSelectionModel().getSelectedItems();
		
		//for-each loop for iterate 
		for(String name:names) {
			System.out.println(name);
		}
	}
}
