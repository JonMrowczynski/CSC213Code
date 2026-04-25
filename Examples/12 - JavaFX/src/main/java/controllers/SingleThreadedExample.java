package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.text.Text;

/**
 * @author Jon Mrowczynski
 */
public class SingleThreadedExample {
	
	@FXML private Button button;
	
	@FXML private ProgressIndicator progressIndicator;
	
	@FXML private Text progressIndicatorText;
	
	@FXML public void handleLongProcess() {
		isRunning(true);
		
		// Simulate running a long process. Here this process takes 5s.
		try { Thread.sleep(10_000); }
		catch (InterruptedException e) { throw new RuntimeException(e); }
		
		isRunning(false);
	}
	
	private void isRunning(boolean isRunning) {
		button.setDisable(isRunning);
		progressIndicator.setVisible(isRunning);
		progressIndicatorText.setVisible(isRunning);
	}
}