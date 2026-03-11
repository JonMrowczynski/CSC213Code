package streams;

import java.io.FileInputStream;
import java.util.Scanner;

public class ReadingFromFile {
	
	public static void main(String[] args) {
		read();
	}
	
	private static void read() {
		try (var scanner = new Scanner(new FileInputStream(Writing2File.FILE_NAME))) {
			System.out.println(scanner.next());
			System.out.println(scanner.next());
		}
		catch (Exception e) { throw new RuntimeException(e); }
	}
}