import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * A few ways of reading data written to files using the {@link Files} utility {@code class}. Data is read from the
 * files that are generated from {@link Writing2File} using {@link Writing2File#writeString(Path, String, boolean)},
 * {@link Writing2File#writeLines(Path, List, boolean)} and
 * {@link Writing2File#writeStringToRelativePath(Path, String, boolean).}
 *
 * @author Jon Mrowczynski
 */
public class ReadingFromFile {
	
	public static void main(String[] args) {
		// Change the input paths to some other path from Writing2File!
		readString(Writing2File.STRING_PATH);
		readLines(Writing2File.LINES_PATH);
	}
	
	/**
	 * Reads the contents of a {@link File} at the given {@link Path} as a whole {@link String}.
	 */
	private static void readString(Path path) {
		try {
			final var str = Files.readString(path);
			System.out.println("The string read from the file: \"" + path + "\" was:");
			System.out.println(str);
		}
		catch (IOException e) { throw new RuntimeException(e); }
	}
	
	/**
	 * Reads the contents of a {@link File} at the given {@link Path} and returns lines of data stored in a
	 * {@link List} of {@link String}s.
	 */
	private static void readLines(Path path) {
		try {
			final var lines = Files.readAllLines(path);
			System.out.println("The lines read from the file: \"" + path + "\" was:");
			for (var line : lines) { System.out.println(line); }
		}
		catch (IOException e) { throw new RuntimeException(e); }
	}
}