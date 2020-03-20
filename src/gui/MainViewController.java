package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemSeller;
	@FXML
	private MenuItem menuItemDepartment;
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("onMenuItemSellerAction");
	}
	
	@FXML
	public void onMenuItemDepartmentAction() {
		System.out.println("onMenuItemDepartmentAction");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		loadView("/gui/about.fxml");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	// Multi thread
	private void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVbox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			//O método .getRoot() pega o primeiro elemento da View
			VBox mainVBox = ((VBox) ((ScrollPane) mainScene.getRoot()).getContent());
			//Crio um nó, e guardo o primeiro elemento da VBox (MenuBar)
			Node mainMenu = mainVBox.getChildren().get(0);
			//limpo todos os filhos da tela anterior
			mainVBox.getChildren().clear();
			//adiciono o MenuBar
			mainVBox.getChildren().add(mainMenu);
			//adiciono todos os filhos da nova view
			mainVBox.getChildren().addAll(newVbox.getChildren());
			
		} catch (IOException e) {
			Alerts.showAlerts("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}
	
}
