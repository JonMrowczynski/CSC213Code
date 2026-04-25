package controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.text.Text;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jon Mrowczynski
 */
public class MultithreadedExample {
	
	private final ExecutorService executorService = Executors.newSingleThreadExecutor();
	
	@FXML private Button button;
	
	@FXML private ProgressIndicator progressIndicator;
	
	@FXML private Text progressIndicatorText;
	
	private final Runnable runnable = () -> {
		// Simulate running a long process. Here this process takes 5s.
		try { Thread.sleep(10_000); }
		catch (InterruptedException e) { throw new RuntimeException(e); }
		
		Platform.runLater(() -> isRunning(false));
	};
	
	public void handleLongProcess() {
		isRunning(true);
		executorService.submit(runnable);
	}
	
	private void isRunning(boolean isRunning) {
		button.setDisable(isRunning);
		progressIndicator.setVisible(isRunning);
		progressIndicatorText.setVisible(isRunning);
	}
	
	public void shutdown() { executorService.shutdownNow(); }
}