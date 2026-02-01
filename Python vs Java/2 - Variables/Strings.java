/**
 * Displays some common usages for formatting Strings in Java. Follow this link:
 * https://www.w3schools.com/java/ref_string_format.asp
 * To find a more detailed breakdown of Java string formatting.
 * 
 * @author Jon Mrowczynski
 */
public class Strings {

    public static void main(String[] args) {
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
    private static void stringConcatenation() {
        System.out.println("String Concatenation Example:");
        var firstHalf = "Can concate";
        var secondHalf = "nate Strings!";
        System.out.println(firstHalf + secondHalf);
        System.out.println();
    }

    /**
     * Offers a few examples displaying some of the most common ways to format integers when printing. Notice that you can group
     * digits in code with '_' rather than a ','.
     */
    private static void integerStringFormatting() {
        System.out.println("Integer String Formatting Examples:");
        var myInt = 15; // Change me!
        System.out.printf("Printing an int: %d\n", myInt);
        System.out.printf("Printing the same int in hex: %x\n", myInt);
        System.out.printf("Printing a large int with digit groupings: %,d\n", 1_000_000_000);
        System.out.println();
    }

    /**
     * Offers a few examples displaying some of the most common ways to format floating-point numbers when printing. 
     */
    private static void floatStringFormatting() {
        System.out.println("Float String Formatting Examples:");
        var myFloat = Math.PI; // Change me!
        System.out.printf("Printing a float: %f\n", myFloat);
        System.out.printf("Printing the same float to two decimal places: %.2f\n", myFloat);
        System.out.println();
    }

    /**
     * Strings are immutable, so if you perform any operation on a String, a new one is created.
     */
    private static void stringMethodsExamples() {
        System.out.println("String Methods Example");
        var str = "Hello World!"; // Change me with care! (You probably will need to change the below method calls)
        System.out.println(str.substring(1, 3));
        System.out.println(str.charAt(7));
        System.out.println(str.contains("Wo"));
        System.out.println(str.indexOf("lo"));
        System.out.println();
    }

    /**
     * Shows some intricacies of Java String comparisons.
     */
    private static void stringComparisonExamples() {
        var str1 = "Hello World!";
        var str2 = "Hello World!"; // Even though this is a new String variable, it points to the same String in the String Constant Pool!
        System.out.println("str1 == \"Hello World!\"? -> " + (str1 == str2));
        System.out.println("str1.equals(str2)? -> " + (str1.equals(str2)));
        System.out.println("str1 == new String(\"Hello World!\")? -> " + (str1 == new String("Hello World!")));
        System.out.println("str1.equals(new String(\"Hello World!\"))? -> " + (str1.equals(new String("Hello World!"))));
        // In summary '==' compares String references, while 'equals()' compares String contents!
    }

    /**
     * Illustrates how to use String text blocks to more simply get Strings with complicated formats.
     */
    private static void textBlockExample() {
        printMenuComplex();
        System.out.println("\n");
        printMenuSimple();
        System.out.println();
    }

    /**
     * A basic simple menu that could be cleaned up as shown below.
     */
    private static void printMenuComplex() {
        System.out.println("Welcome to the program! Enter:\n");
        System.out.println("\t1. For Option 1.");
        System.out.println("\t2. For Options 2.");
        System.out.println("\t3. For Option 3.");
        System.out.println("\t4. To Quit.\n");
        System.out.print("Input: ");
    }

    /**
     * Text blocks helps to simplify and clarify exactly what is going to be printed and how a String is formatted when you have
     * significantly more complicated formatted outputs. The same formatting ideas presented above can be applied to text blocks
     * as well since text blocks are also just Strings!
     */
    private static void printMenuSimple() {
        System.out.print("""
                Welcome to the program! Enter:

                        1. For Option 1.
                        2. For Option 2.
                        3. For Option 3.
                        4. To Quit.
               
                Input:
                """);
    }
}