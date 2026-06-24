/**
 * @author Jon Mrowczynski
 */
final String FILE_NAME = "writtenData.txt";

Optional<int[]> add3(int[] myInts) {
	if (myInts == null) { return Optional.empty(); }
	for (var i = 0; i < myInts.length; ++i) { myInts[i] += 3; }
	return Optional.of(myInts);
}

// Can either catch or throw a checkedException
void checkedException() /* throws IOException */ {
	try (var fos = new FileOutputStream("MyFile.txt")) {
		IO.println("In try.");
	}
	catch (IOException e) { IO.println("In catch."); }
}

void writingWithExplicitClose(int exceptionNum) {
	PrintWriter writer = null;
	try {
		IO.println("In try block:");
		if (exceptionNum == 0) { return; }
		var fos = new FileOutputStream(FILE_NAME); // Should technically close this
		if (exceptionNum == 1) { throw new FileNotFoundException("Exception 1 thrown!"); }
		IO.println("\tMade FileOutputStream.");
		writer = new PrintWriter(fos);
		writer.println("Hello World!");
		if (exceptionNum == 2) { throw new FileNotFoundException("Exception 2 thrown!"); }
		writer.close();
	}
	catch (FileNotFoundException e) {
		IO.println("In catch block due to -> " + e);
		// Sometimes you just have a really bad day.
		//			throw e; // If this gets thrown, we don't execute code after the finally block.
	} finally {
		IO.println("In finally block:");
		if (writer != null) {
			writer.close();
			IO.println("\tClosed writer.");
		}
		else { IO.println("\tWriter was never instantiated, so can't close."); }
	}
	IO.println("I am outside:");
}

void writingWithTryWithResourcesWithExceptions(int exceptionNum) {
	try (var writer = new PrintWriter(new FileOutputStream(FILE_NAME))) {
		IO.println("In try block:");
		if (exceptionNum == 1) { throw new FileNotFoundException("Exception 1 thrown!"); }
		writer.println("Hello World!");
		if (exceptionNum == 2) { throw new FileNotFoundException("Exception 2 thrown!"); }
	}
	catch (IOException e) {
		IO.println("In catch block:");
		// throw e;
	} // Can still add a finally block, but don't need.
	IO.println("I am outside:");
}

void main() {
	uncheckedException();
	//		int[] myInts = {1, 2, 3};
	//		final var optInts = add3(myInts);
	//		optInts.ifPresent(arr -> IO.println(Arrays.toString(arr)));
}

/**
 * Basically any RuntimeException is unchecked.
 */
void uncheckedException() {
	final var scanner = new Scanner(System.in);
	try {
		final var myInt = scanner.nextInt();
		IO.println("After input.");
	}
	catch (InputMismatchException e) { IO.println("do a thing here."); }
	catch (NoSuchElementException e) { IO.println("do another thing here"); }
}