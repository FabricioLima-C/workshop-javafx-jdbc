package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.SpringLayout.Constraints;

import gui.util.Contraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {
	
	@FXML
	private TextField txtId;
	@FXML 
	private TextField txtName;
	@FXML
	private Label labelErrorName;
	@FXML
	private Button btSave;
	@FXML
	private Button btCancel;
	
	@FXML
	public void onBtSaveAction() {
		System.out.println("Teste BtSave");
	}
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("Teste BtCancel");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {	
	}
	
	private void initializeNodes() {
		Contraints.setFieldInteger(txtId);
		Contraints.setTextFieldDouble(txtName, 30);
	}
	
}
