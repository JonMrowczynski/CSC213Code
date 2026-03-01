import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Contains some examples displaying how to write a {@link String} or a {@link List} of {@code String}s to a
 * {@link File} using the {@link Files} utility {@code class}.
 * <p>
 * While there are around 10 different ways to write data to files, this is one of the more common ways that I write
 * data to a file since a lot of the magic is handled implicitly by the {@link Files} utility class.
 *
 * @author Jon Mrowczynski
 */
public class Writing2File {
	
	// Notice, the absence of an explicit access modifier indicates "package-private". Meaning that those fields or
	// methods can be accessed anywhere in the class's containing package.
	
	static final Path STRING_PATH = Paths.get("writtenString.txt");
	
	static final Path LINES_PATH = Paths.get("writtenLines.txt");
	
	static final Path COMPLEX_PATH = Paths.get("path", "2", "myOtherFile.txt");
	
	public static void main(String[] args) {
		final var str = """
				Here is an int: %d
					and here is
						a float: %f
							That!
						will be...
					written!
				Along with this str: %s
				""".formatted(42, 3.14, "Howdy!");
		writeString(STRING_PATH, str, false);
		
		final var lines = List.of("Line 1:", "Line 2:", "Line 3:", "etc...");
		writeLines(LINES_PATH, lines, false);
		
		writeStringToRelativePath(COMPLEX_PATH, "Surprise!", false);
	}
	
	/**
	 * Writes a {@link String} to a {@link File} at the given {@link Path}.
	 *
	 * @param path      the relative {@link Path} to the {@link File} that will contain the data.
	 * @param str2Write the {@link String} to write to the {@link File}.
	 * @param append    a {@code boolean} that determines whether the data should be appended to the file.
	 * @see Writing2File#writeLines(Path, List, boolean)
	 */
	static void writeString(Path path, String str2Write, boolean append) {
		System.out.println("Writing string to path: \"" + path + "\"");
		try {
			if (append) { Files.writeString(path, str2Write, StandardOpenOption.APPEND); }
			else { Files.writeString(path, str2Write); }
		}
		catch (IOException e) { throw new RuntimeException(e); }
	}
	
	/**
	 * Writes each element in the given {@link List} of {@link String}s to its own line in the {@link File} located
	 * at the given {@link Path}.
	 *
	 * @param path   the relative {@link Path} to the {@link File} that will contain the data.
	 * @param lines  the lines of data to write to the {@link File}.
	 * @param append a {@code boolean} that determines whether the data should be appended to the file.
	 * @see Writing2File#writeString(Path, String, boolean)
	 */
	static void writeLines(Path path, List<? extends String> lines, boolean append) {
		System.out.println("Writing lines to path: \"" + path + "\"");
		try {
			if (append) { Files.write(path, lines, StandardOpenOption.APPEND); }
			else { Files.write(path, lines); }
		}
		catch (IOException e) { throw new RuntimeException(e); }
	}
	
	/**
	 * This is a more robust version of {@link Writing2File#writeString(Path, String, boolean)} since it can handle
	 * relative {@link Path}s to files that don't have their parent directories created.
	 *
	 * @param path      the relative {@link Path} to the {@link File} that will contain the data.
	 * @param str2Write the {@link String} to write to the {@link File}.
	 * @param append    a {@code boolean} that determines whether the data should be appended to the file.
	 * @see Writing2File#writeString(Path, String, boolean)
	 */
	static void writeStringToRelativePath(Path path, String str2Write, boolean append) {
		System.out.println("Writing string to path: \"" + path + "\"");
		final var parent = path.getParent();
		if (!Files.exists(parent)) { parent.toFile().mkdirs(); }
		try {
			if (append) { Files.writeString(path, str2Write, StandardOpenOption.APPEND); }
			else { Files.writeString(path, str2Write); }
		}
		catch (IOException e) { throw new RuntimeException(e); }
	}
}