package com.vineetku.test.client;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainApp extends Application {

	private Stage primaryStage;
    private BorderPane rootLayout;
   
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("HeliosTab");
        showPersonOverview();
    }
    /**
     * Shows the person overview inside the root layout.
     */
    public void showPersonOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
           //URL url=getClass().getResource("/fxml/Focustab.fxml");
            loader.setLocation(MainApp.class.getResource("/fxml/Focustab.fxml"));
           // Pane focusPane = (Pane)FXMLLoader.load(getClass().getResource("/fxml/Focustab.fxml"));
            Pane focusPane=(Pane)loader.load();
            FocusPaneController controller = loader.getController();
            controller.setMainApp(this);
            Scene myScene = new Scene(focusPane);
            primaryStage.setScene(myScene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
    public static void main(String[] args) {
		launch(args);
	}
    
    public ObservableList<String> getCities(){
    	ObservableList<String> cities=FXCollections.observableArrayList();
    	cities.add("Paris");
    	cities.add("Strasbourg");
    	return cities;
    }
	
}
