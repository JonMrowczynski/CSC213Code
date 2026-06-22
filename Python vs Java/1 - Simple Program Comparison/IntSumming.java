/**
 * A sample Java program for comparison with a functionally equivalent Python program.
 * Java version: 25.0.3
 *
 * @author Jon Mrowczynski
 */

/**
 * Simply prints the introductory message to the program. This is a bit too small to potentially include in its
 * own function, but it's here to illustrate a point.
 */
void printWelcomeMsg() {
	IO.println("Enter integers one at a time and I will sum them! :D!");
	IO.println("Or, enter 'q' at any time to quit.");
}

void main() { // args are the command line arguments entered in when the program is run.
	printWelcomeMsg();
	int sum = 0; // Need to explicitly declare each variable's type. Although you can use type inferencing...
	// like: var input = IO.readln("Input: "); where "var" is used instead of explicitly declaring the type.
	String input = "";

	while (!input.equals("q")) { // Loop as long as this condition is met.
		// Ask for input. 
		input = IO.readln("Input: ");
		
		// If there is an issue processing the input, then handle that issue.
		try { sum += Integer.parseInt(input); }
		catch (NumberFormatException e) {
			if (!input.equals("q")) { IO.println("Please enter in only integers or 'q', thanks! :)"); }
		}
	}

	IO.println("Final sum = " + sum);
}