import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Jon Mrowczynski
 */
public class FileChoosingExamples {
	
	void runExamples(final Stage primaryStage) {
		fileSaverExample(primaryStage);
		fileChooserExample(primaryStage);
	}
	
	private void fileSaverExample(final Stage stage) {
		final var fileSaver = new FileChooser();
		final var outputFile = fileSaver.showSaveDialog(stage);
		if (outputFile != null) {
			// Do something with the file just like any other file.
			try (final var fos = new FileOutputStream(outputFile); final var writer = new PrintWriter(fos)) {
				writer.println("Writing some data!");
			}
			catch (IOException e) { throw new RuntimeException(e); }
		}
		else { System.out.println("File not chosen."); }
	}
	
	private void fileChooserExample(final Stage stage) {
		final var fileChooser = new FileChooser();
		fileChooser.setTitle("File Selector!");
		final var inputFile = fileChooser.showOpenDialog(stage);
		if (inputFile != null) {
			// Do Something with the file just like any other file.
			try (final var fis = new FileInputStream(inputFile); final var scanner = new Scanner(fis)) {
				System.out.println("The data read was: \"" + scanner.nextLine() + "\"");
			}
			catch (IOException e) { throw new RuntimeException(e); }
		}
		else { System.out.println("File not chosen."); }
	}
}