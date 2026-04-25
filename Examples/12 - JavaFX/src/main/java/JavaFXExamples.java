import controllers.MultithreadedExample;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @author Jon Mrowczynski
 */
public class JavaFXExamples extends Application {
	
	public static void main(String[] args) {
		System.out.println("Threads' name in main: " + Thread.currentThread().getName());
		launch(args);
	}
	
	@Override public void start(final Stage primaryStage) {
		System.out.println("Thread's name in start: " + Thread.currentThread().getName());
		
		// File Choosing code:
		
		//		new FileChoosingExamples().runExamples(primaryStage);
		/*
			Normally you would want to call primaryStage.show() and the Application would close upon closing the
			primaryStage. However, since we aren't doing anything of interest here except showing some simple
			examples, this isn't necessary.
		 */
		//		Platform.exit();
		
		// Single/Multithreading code:
		primaryStage.setTitle("Running Long Processes");
		primaryStage.setAlwaysOnTop(true); // So app always stays in view in front of everything else.
		
		var good = true;
		var resourceName = "/long-process-" + (good ? "good" : "bad") + ".fxml";
		var loader = new FXMLLoader(JavaFXExamples.class.getResource(resourceName));
		try {
			Scene scene = loader.load();
			primaryStage.setScene(scene);
			if (good) {
				MultithreadedExample multithreadedExample = loader.getController();
				primaryStage.setOnCloseRequest(windowEvent -> multithreadedExample.shutdown());
			}
			primaryStage.show();
		}
		catch (IOException e) { throw new RuntimeException(e); }
	}
}