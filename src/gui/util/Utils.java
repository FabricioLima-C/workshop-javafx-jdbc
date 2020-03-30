package gui.util;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {
	// ActionEvent � o evento que o bot�o recebeu
	public static Stage currentStage(ActionEvent event) {
		// fazendo o downcasting para para node e depois com a chamada do m�todo
		// getWindow que � da super classe de stage, por fim, downcasting para stage
		return (Stage) ((Node) event.getSource()).getScene().getWindow();
	}
	
	public static Integer tryParseToInt(String str) {
		try {
			return Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			return null;
		}
	}
	
}
