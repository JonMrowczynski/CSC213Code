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

        switchExpressionExample();
        switchStatementExample();

        andExamples();
        orExamples();
        notExamples();
    }

    /**
     * Java jas more standard switch expression that has grown relatively powerful with recent versions.
     */
    private static void switchExpressionExample() {
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
    }

    /**
     * Note that a switch statement doesn't use breaks! This is done for you behind the scenes. switch statements can also work
     * on other data types, not just Strings.
     */
    private static void switchStatementExample() {
        var pattern = "Set me to something";
        var result = switch(pattern) {
            case "Hello" -> 1;
            case "World!" -> 2;
            default -> 3;
        };
        System.out.println(result); // The value of result depends on the value of pattern!
    }

    /**
     * Shows logical results using the and '&&' operator. The first two boolean expressions have dead code on the right due to
     * short-circuiting. This shouldn't be confused with the bitwise and '&'.
     */
    private static void andExamples() {
        System.out.printf("""
                
                And Examples:
                false && false: %b
                false && true: %b
                true %% false: %b
                true && true: %b
                """, false && false, false && true, true && false, true && true);
    }

    /**
     * Shows logical results using the or '||' operator. The last two boolean expressions have dead code on the right due to
     * short-circuiting. This shouldn't be confused with the bitwise or '|'.
     */
    private static void orExamples() {
        System.out.printf("""

                Or Examples:
                false || false: %b
                false || true: %b
                true || false: %b
                true || true: %b
                """, false || false, false || true, true || false, true || true);
    }

    /**
     * Shows logical results using the not '!' operator. This shouldn't be confused with the bitwise not '~'.
     */
    private static void notExamples() {
        System.out.printf("""

                Not Examples:
                !false: %b
                !true: %b
                """, !false, !true);
    }
}
