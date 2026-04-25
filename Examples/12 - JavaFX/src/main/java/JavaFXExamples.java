import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

/**
 * @author Jon Mrowczynski
 */
public class JavaFXExamples extends Application {
	
	@Override public void start(final Stage primaryStage) {
		
		new FileChoosingExamples().runExamples(primaryStage);
		
		/*
			Normally you would want to call primaryStage.show() and the Application would close upon closing the
			primaryStage. However, since we aren't doing anything of interest here except showing some simple
			examples, this isn't necessary.
		 */
		Platform.exit();
	}
}