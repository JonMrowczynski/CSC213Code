package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Writing2File {
	
	static final String FILE_NAME = "writtenData.txt";
	
	public static void main(String[] args) {
		writingWithExplicitClose();
	}
	
	private static void writingWithExplicitClose() {
		try {
			var fos = new FileOutputStream(FILE_NAME);
			var writer = new PrintWriter(fos);
			writer.println("Hello World!");
			writer.close();
		}
		catch (FileNotFoundException e) { throw new RuntimeException(e); }
	}
	
	private static void writingWithTryWithResources() {
		try (var writer = new PrintWriter(new FileOutputStream(FILE_NAME))) {
			writer.println("Hello World!");
		}
		catch (IOException e) { throw new RuntimeException(e); }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void writingWithExplicitClose(int exceptionNum) {
		PrintWriter writer = null;
		try {
			System.out.println("In try block:");
			var fos = new FileOutputStream(FILE_NAME); // Should technically close this
			if (exceptionNum == 1) { throw new FileNotFoundException("Exception 1 thrown!"); }
			System.out.println("\tMade FileOutputStream.");
			writer = new PrintWriter(fos);
			writer.println("Hello World!");
			if (exceptionNum == 2) { throw new FileNotFoundException("Exception 2 thrown!"); }
			writer.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("In catch block due to -> " + e);
			// Sometimes you just have a really bad day.
			//			throw e; // If this gets thrown, we don't execute code after the finally block.
		} finally {
			System.out.println("In finally block:");
			if (writer != null) {
				writer.close();
				System.out.println("\tClosed writer.");
			}
			else { System.out.println("\tWriter was never instantiated, so can't close."); }
		}
		System.out.println("I am outside:");
	}
	
	private static void writingWithTryWithResourcesWithExceptions(int exceptionNum) {
		try (var writer = new PrintWriter(new FileOutputStream(FILE_NAME))) {
			System.out.println("In try block:");
			if (exceptionNum == 1) { throw new FileNotFoundException("Exception 1 thrown!"); }
			writer.println("Hello World!");
			if (exceptionNum == 2) { throw new FileNotFoundException("Exception 2 thrown!"); }
		}
		catch (IOException e) {
			System.out.println("In catch block:");
			// throw e;
		} // Can still add a finally block, but don't need.
		System.out.println("I am outside:");
	}
}