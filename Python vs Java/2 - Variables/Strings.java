/**
 * Displays some common usages for formatting Strings in Java. Follow this link:
 * https://www.w3schools.com/java/ref_string_format.asp
 * To find a more detailed breakdown of Java string formatting.
 * 
 * Java version: 25.0.3
 * 
 * @author Jon Mrowczynski
 */
void main() {
    stringConcatenation();
    integerStringFormatting();
    floatStringFormatting();
    stringMethodsExamples();
    stringComparisonExamples();
    textBlockExample();
}

/**
 * Shows how to concatenate Strings. Notice that String literals have to be created with double quotes. Single quotes are
 * used for characters in Java.
 */
void stringConcatenation() {
    IO.println("String Concatenation Example:");
    var firstHalf = "Can concate";
    var secondHalf = "nate Strings!";
    IO.println(firstHalf + secondHalf);
    IO.println();
}

/**
 * Offers a few examples displaying some of the most common ways to format integers when printing. Notice that you can group
 * digits in code with '_' rather than a ','.
 */
void integerStringFormatting() {
    IO.println("Integer String Formatting Examples:");
    var myInt = 15; // Change me!
    IO.println("Printing an int: %d".formatted(myInt));
    IO.println("Printing the same int in hex: %x".formatted(myInt));
    IO.println("Printing a large int with digit groupings: %,d".formatted(1_000_000_000));
    IO.println();
}

/**
 * Offers a few examples displaying some of the most common ways to format floating-point numbers when printing. 
 */
void floatStringFormatting() {
    IO.println("Float String Formatting Examples:");
    var myFloat = Math.PI; // Change me!
    IO.println("Printing a float: %f".formatted(myFloat));
    IO.println("Printing the same float to two decimal places: %.2f".formatted(myFloat));
    IO.println();
}

/**
 * Strings are immutable, so if you perform any operation on a String, a new one is created.
 */
void stringMethodsExamples() {
    IO.println("String Methods Example:");
    var str = "Hello World!"; // Change me with care! (You probably will need to change the below method calls)
    IO.println(str.substring(1, 3));
    IO.println(str.charAt(7));
    IO.println(str.contains("Wo"));
    IO.println(str.indexOf("lo"));
    IO.println();
}

/**
 * Shows some intricacies of Java String comparisons.
 */
void stringComparisonExamples() {
    var str1 = "Hello World!";
    var str2 = "Hello World!"; // Even though this is a new String variable, it points to the same String in the String Constant Pool!
    IO.println("str1 == \"Hello World!\"? -> " + (str1 == str2));
    IO.println("str1.equals(str2)? -> " + (str1.equals(str2)));
    IO.println("str1 == new String(\"Hello World!\")? -> " + (str1 == new String("Hello World!")));
    IO.println("str1.equals(new String(\"Hello World!\"))? -> " + (str1.equals(new String("Hello World!"))));
    // In summary '==' compares String references, while 'equals()' compares String contents!
    IO.println();
}

/**
 * Illustrates how to use String text blocks to more simply get Strings with complicated formats.
 */
void textBlockExample() {
    printMenuComplex();
    IO.println("\n");
    printMenuSimple();
    IO.println();
}

/**
 * A basic simple menu that could be cleaned up as shown below.
 */
void printMenuComplex() {
    IO.println("Welcome to the program! Enter:");
    IO.println("\t1. For Option 1.");
    IO.println("\t2. For Options 2.");
    IO.println("\t3. For Option 3.");
    IO.println("\t4. To Quit.");
    IO.print("Input: ");
}

/**
 * Text blocks helps to simplify and clarify exactly what is going to be printed and how a String is formatted when you have
 * significantly more complicated formatted outputs. The same formatting ideas presented above can be applied to text blocks
 * as well since text blocks are also just Strings!
 */
void printMenuSimple() {
    IO.print("""
            Welcome to the program! Enter:
                    1. For Option 1.
                    2. For Option 2.
                    3. For Option 3.
                    4. To Quit.
            Input:
            """);
}