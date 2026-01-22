import java.util.Scanner;

/**
 * A sample Java program for comparison with a functionally equivalent Python program.
 *
 * @author Jon Mrowczynski
 */
public class IntSumming { // Java needs to have a root class in each of its .java files that have the same name.
	
	/**
	 * Simply prints the introductory message to the program. This is a bit too small to potentially include in its
	 * own function, but it's here to illustrate a point.
	 */
	private static void printWelcomeMsg() {
		System.out.println("Enter integers one at a time and I will sum them! :D!");
		System.out.println("Or, enter 'q' at any time to quit.");
	}
	
	public static void main(String[] args) { // args are the command line arguments entered in when the program is run.
		printWelcomeMsg();
		final Scanner scanner = new Scanner(System.in); // Need to explicitly make a Scanner Object for user input.
		int sum = 0; // Need to explicitly declare each variable's type. Although you can use type inferencing...
		String input = ""; // Could declare variables using type inferencing instead like: var input = "";
		
		while (!input.equals("q")) { // Loop as long as this condition is met.
			// Ask for input
			System.out.print("Input: ");
			input = scanner.nextLine();
			
			// If there is an issue processing the input, then handle that issue.
			try { sum += Integer.parseInt(input); }
			catch (NumberFormatException e) {
				if (!input.equals("q")) { System.out.println("Please enter in only integers or 'q', thanks! :)"); }
			}
		}

		// Always make sure to close your Closeables! This helps to free up resources and prevent memory leaks.
		scanner.close();
		System.out.printf("Final sum = %d\n", sum);
	}
}
