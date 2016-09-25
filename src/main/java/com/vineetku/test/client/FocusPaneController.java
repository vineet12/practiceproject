package com.vineetku.test.client;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class FocusPaneController {
	
	
	private MainApp mainApp;
	
	private ObservableList<String> cities;
	
	@FXML
	private TextField firstname;
	
	@FXML
	private TextField lastname;
	
	@FXML
	private ComboBox<String> selectcity;
	
	 
	public FocusPaneController(){
		
	}
	@FXML
	private void initialize() {
		firstname.setText("Vineet");
		lastname.setText("Kumar");
		selectcity.setItems(cities);
	}

	public void setMainApp(MainApp mainApp){
		this.mainApp=mainApp;
		selectcity.setItems(mainApp.getCities());
		
	}
	public void setCities(ObservableList<String> cities) {
		this.cities = cities;
	}
	
	
	
	

}
