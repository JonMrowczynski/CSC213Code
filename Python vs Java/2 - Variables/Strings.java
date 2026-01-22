/**
 * Displays some common usages for formatting Strings in Java. Follow this link:
 * https://www.w3schools.com/java/ref_string_format.asp
 * To find a more detailed breakdown of Java string formatting.
 * 
 * @author Jon Mrowczynski
 */
public class Strings {

    public static void main(String[] args) {
        // Strings literals require double quotes.
        var firstHalf = "Can concate";
        var secondHalf = "nate Strings!";
        System.out.println(firstHalf + secondHalf);
        System.out.println();

        var myInt = 15; // Change me!
        
        System.out.println(String.format("Printing an int: %d", myInt));
        System.out.println(String.format("Printing the same int in hex: %x", myInt));
        System.out.println(String.format("Printing a large int with digit groupings: %,d", 1_000_000_000));
        // Notice that you can group digits in code with '_' rather than a ','.
        System.out.println();

        var myFloat = Math.PI; // Change me!

        System.out.println(String.format("Printing a float: %f", myFloat));
        System.out.println(String.format("Printing the same float to two decimal places: %.2f", myFloat));
        System.out.println();

        printMenuComplex();
        System.out.println("\n");
        printMenuSimple();
        System.out.println();

        // Strings are immutable, so if you perform any operation on a String, a new one has to be created.
        var str1 = "Hello World!";
        System.out.println(str1.substring(1, 3));
        System.out.println(str1.charAt(7));
        System.out.println(str1.contains("Wo"));
        System.out.println(str1.indexOf("lo"));
        System.out.println();

        var str2 = "Hello World"; // Even though this is a new String variable, it points to the same String in the String Constant Pool.
        System.out.println("str1 == \"Hello World!\"? -> " + (str1 == str2));
        System.out.println("str1.equals(str2)? -> " + (str1.equals(str2)));
        System.out.println("str1 == new String(\"Hello World!\")? -> " + (str1 == new String("Hello World!")));
        System.out.println("str1.equals(new String(\"Hello World!\"))? -> " + (str1.equals(new String("Hello World!"))));
        // In summary '==' compares String references, while 'equals()' compares String contents!
    }

    /**
     * A basic simple menu that could be cleaned up as shown below.
     */
    public static void printMenuComplex() {
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
    public static void printMenuSimple() {
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