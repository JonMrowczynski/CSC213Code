/**
 * Need a bit more ceremonial code here for Java, which is kind of a gift and a curse.
 * 
 * Java Version: 25.0.3
 * 
 * @author Jon Mrowczynski
 */
void main() {
    // Boolean values are "true" or "false"

    var iAmTrue = true;
    var iAmFalse = false;
    var iAmAlsoTrue = true;

    // if-if else-else branching is supported (more standard "else if" is used)
    // Java uses curly braces to associated code.
    if (iAmTrue) {
        IO.println("This executed because the if condition was True.");
    } else if (iAmAlsoTrue) {
        IO.println("Even though the else if condition is also True, since the if condition was True, this will not execute.");
    } else {
        IO.println("This would only execute if all other conditions were false.");
    }

    var iAmDependent = (iAmTrue) ? 1 : 0; // Java has conditional expressions commonly used for assignments.
    IO.println(iAmDependent);

    switchExpressionExample();
    switchStatementExample();

    IO.println();

    andExamples();
    orExamples();
    notExamples();
}

/**
 * Java jas more standard switch expression that has grown relatively powerful with recent versions.
 */
void switchExpressionExample() {
    var pattern = "Set me to another String";
    switch(pattern) {
        case "Hello":
            IO.println("Do something here if String is \"Hello\".");
            break; // An explicit break statement is required to stop potentially running more cases.
        case "World!":
            IO.println("Do something here is String is \"World!\".");
            break;
        default:
            IO.println("This is run if pattern doesn't match any other case.");
            // Don't need to explicitly break default.
    }
}

/**
 * Note that a switch statement doesn't use breaks! This is done for you behind the scenes. switch statements can also work
 * on other data types, not just Strings.
 */
void switchStatementExample() {
    var pattern = "Set me to something";
    var result = switch(pattern) {
        case "Hello" -> 1;
        case "World!" -> 2;
        default -> 3;
    };
    IO.println(result); // The value of result depends on the value of pattern!
}

/**
 * Shows logical results using the and '&&' operator. The first two boolean expressions have dead code on the right due to
 * short-circuiting. This shouldn't be confused with the bitwise and '&'.
 */
void andExamples() {
    IO.println("""
            And Examples:
            false && false: %b
            false && true: %b
            true %% false: %b
            true && true: %b
            """.formatted(false && false, false && true, true && false, true && true));
}

/**
 * Shows logical results using the or '||' operator. The last two boolean expressions have dead code on the right due to
 * short-circuiting. This shouldn't be confused with the bitwise or '|'.
 */
void orExamples() {
    IO.println("""
            Or Examples:
            false || false: %b
            false || true: %b
            true || false: %b
            true || true: %b
            """.formatted(false || false, false || true, true || false, true || true));
}

/**
 * Shows logical results using the not '!' operator. This shouldn't be confused with the bitwise not '~'.
 */
void notExamples() {
    IO.println("""
            Not Examples:
            !false: %b
            !true: %b
            """.formatted(!false, !true));
}
