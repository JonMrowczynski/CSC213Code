/**
 * Need a bit more ceremonial code here for Java, which is kind of a gift and a curse.
 * 
 * @author Jon Mrowczynski
 * Java Version: 21.0.9
 */
public class Branching {
    public static void main(String[] args) {
        // Boolean values are "true" or "false"

        var iAmTrue = true;
        var iAmFalse = false;
        var iAmAlsoTrue = true;

        // if-if else-else branching is supported (more standard "else if" is used)
        // Java uses curly braces to associated code.
        if (iAmTrue) {
            System.out.println("This executed because the if condition was True.");
        } else if (iAmAlsoTrue) {
            System.out.println("Even though the else if condition is also True, since the if condition was True, this will not execute.");
        } else {
            System.out.println("This would only execute if all other conditions were false.");
        }

        var iAmDependent = (iAmTrue) ? 1 : 0; // Java has conditional expressions commonly used for assignments.
        System.out.println(iAmDependent);

        // Java has a more standard switch expression/statement that has grow relatively powerful with recent versions.
        // The switch expression
        var pattern = "Set me to another String";
        switch(pattern) {
            case "Hello":
                System.out.println("Do something here if String is \"Hello\".");
                break; // An explicit break statement is required to stop potentially running more cases.
            case "World!":
                System.out.println("Do something here is String is \"World!\".");
                break;
            default:
                System.out.println("This is run if pattern doesn't match any other case.");
                // Don't need to explicitly break default.
        }

        // Switch statement
        var result = switch(pattern) {
            case "Hello" -> 1; // Notice don't need to explicitly break! That is done for you.
            case "World!" -> 2;
            default -> 3;
        };
        System.out.println(result); // The value of result depends on the value of pattern!

        System.out.println();
        // Logical operators include && (and), || (or), and ! (not)
        System.out.println("false && false: " + (false && false)); // The expression on the right is dead code due to short-circuiting.
        System.out.println("false && true: " + (false && true)); // The expression on the right is dead code due to short-circuiting.
        System.out.println("true && false: " + (true && false));
        System.out.println("true && true: " + (true && true));
        System.out.println();

        System.out.println("false || false: " + (false || false));
        System.out.println("false || true: " + (false || true));
        System.out.println("true || false: " + (true || false)); // The expression on the right is dead code due to short-circuiting.
        System.out.println("true || true: " + (true || true)); // The expression on the right is dead code due to short-circuiting.
        System.out.println();

        System.out.println("!false: " + !false);
        System.out.println("!true: " + !true);
    }
}
