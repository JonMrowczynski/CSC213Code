import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;

public class ExceptionsExamples {
	
	private static final String FILE_NAME = "writtenData.txt";
	
	public static void main(String[] args) {
		uncheckedException();
		//		int[] myInts = {1, 2, 3};
		//		final var optInts = add3(myInts);
		//		optInts.ifPresent(arr -> System.out.println(Arrays.toString(arr)));
	}
	
	/**
	 * Basically any RuntimeException is unchecked.
	 */
	private static void uncheckedException() {
		final var scanner = new Scanner(System.in);
		try {
			final var myInt = scanner.nextInt();
			System.out.println("After input.");
		}
		catch (InputMismatchException e) {
			System.out.println("do a thing here.");
		}
		catch (NoSuchElementException e) {
			System.out.println("do another thing here");
		}
	}
	
	private static Optional<int[]> add3(int[] myInts) {
		if (myInts == null) { return Optional.empty(); }
		for (var i = 0; i < myInts.length; ++i) { myInts[i] += 3; }
		return Optional.of(myInts);
	}
	
	private static void checkedException() throws FileNotFoundException {
		final var fos = new FileOutputStream("MyFile.txt");
		//		try {
		//			System.out.println("In try.");
		//		} catch (FileNotFoundException e) {
		//			System.out.println("In catch.");
		//		}
	}
	
	private static void writingWithExplicitClose(int exceptionNum) {
		PrintWriter writer = null;
		try {
			System.out.println("In try block:");
			if (exceptionNum == 0) { return; }
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
	
	
	//	private static void writingWithTryWithResourcesWithExceptions(int exceptionNum) {
	//		try (var writer = new PrintWriter(new FileOutputStream(FILE_NAME))) {
	//			System.out.println("In try block:");
	//			if (exceptionNum == 1) { throw new FileNotFoundException("Exception 1 thrown!"); }
	//			writer.println("Hello World!");
	//			if (exceptionNum == 2) { throw new FileNotFoundException("Exception 2 thrown!"); }
	//		}
	//		catch (IOException e) {
	//			System.out.println("In catch block:");
	//			// throw e;
	//		} // Can still add a finally block, but don't need.
	//		System.out.println("I am outside:");
	//	}
	
}
