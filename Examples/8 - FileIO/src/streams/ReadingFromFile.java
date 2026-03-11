package streams;

import java.io.FileInputStream;
import java.util.Scanner;

/**
 * @author Jon Mrowczynski
 */
public class ReadingFromFile {
	
	public static void main(String[] args) {
		read();
	}
	
	/**
	 * A basic example of how to read data from a file.
	 * <p>
	 * This method of reading from a file uses a very similar approach to reading data from user input!
	 * <p>
	 * Instead of using the standard System.in (keyboard input) we use a FileInputStream to get the data from a file.
	 * <p>
	 * Sometimes problems are encountered when reading from a file (like the file not existing) so you have to wrap the
	 * file reading in a try-with-resources statement. This MAKES SURE that the file is properly closed even if an
	 * exception is thrown.
	 */
	private static void read() {
		try (var scanner = new Scanner(new FileInputStream(Writing2File.FILE_NAME))) {
			System.out.println(scanner.next());
		}
		// Usually shouldn't throw another exception in a catch. But here for demo purposes.
		catch (Exception e) { throw new RuntimeException(e); }
	}
}