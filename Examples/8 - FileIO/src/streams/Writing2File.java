package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Jon Mrowczynski
 */
public class Writing2File {
	
	/**
	 * The name of the file that will contain the written data and will be read from in {@link ReadingFromFile}.
	 */
	static final String FILE_NAME = "writtenData.txt";
	
	public static void main(String[] args) {
		writingWithExplicitClose(false);
	}
	
	// DO NOT USE THIS. THIS IS LEFT HERE FOR DEMO PURPOSES ONLY.
	// ////////////////////////////////////////////////////
	
	/**
	 * A basic example of how to write data from a file.
	 * <p>
	 * This method of writing from a file uses a very similar approach to write data from user input!
	 * <p>
	 * Instead of using the standard System.out (terminal output) we use a FileOutputStream to write data to a file.
	 * <p>
	 * Sometimes problems are encountered when writing to a file (like trying to write to a directory) so you have to
	 * wrap the file reading in a try-catch statement. THIS IS NOT THE DESIRED WAY TO DO THIS THOUGH. For a better
	 * approach:
	 *
	 * @param append a {@code boolean} represents whether the data written to the file should be appended to the
	 *               existing contents.
	 * @see Writing2File#writingWithTryWithResources(boolean)
	 */
	private static void writingWithExplicitClose(boolean append) {
		try {
			var fos = new FileOutputStream(FILE_NAME, append);
			var writer = new PrintWriter(fos);
			writer.println("Hello World!");
			// Should close our writer to properly close File...but if an exception occurs prior to this statement,
			// the file won't be properly closed! Preventing other programs from accessing it.
			writer.close();
		}
		catch (FileNotFoundException e) { throw new RuntimeException(e); }
	}
	
	/// ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	/**
	 * Does the exact same thing as {@link Writing2File#writingWithExplicitClose(boolean)}, but with a
	 * try-with-resources statement to MAKE SURE that our file is properly closed.
	 *
	 * @param append a {@code boolean} represents whether the data written to the file should be appended to the
	 *               existing contents.
	 */
	private static void writingWithTryWithResources(boolean append) {
		try (var writer = new PrintWriter(new FileOutputStream(FILE_NAME, append))) {
			writer.println("Hello World!");
		}
		catch (IOException e) { throw new RuntimeException(e); }
	}
}