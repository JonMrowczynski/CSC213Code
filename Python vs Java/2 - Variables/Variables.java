import java.math.BigInteger;

/**
 * Need a bit more ceremonial code here for Java, which is kind of a gift and a curse.
 * 
 * @author Jon Mrowczynski
 * Java Version: 21.0.9
 */
public class Variables {

    public static void main(String[] args) {

        String x = "Hello!"; // Need explicit type declaration since Java is statically typed.

        x = "Hello again!"; // Strings only use double quotes, not single quotes, which are used for characters.

        char c = 'H'; // Single quotes are used here to represent the character 'H';

        // x = 3; // This would cause a compilation error if commented out since you cannot dynamically change the types in Java.

        int y = 3; // So have to declare a new variable if you want an int.

        // While Java is statically typed, we can use type inferencing to prevent us from explicitly stating the variables type!
        // All you have to do is us the keyword 'var' and the Java compiler figures out the variable type based on the assignment!
        var z = 3.14;
        var otherString = "Type Inferenced String!";
        var otherInt = 42;

        // Some built-in data types in Java include, but are not limited to:
        
        // primitive data types: 
        //  byte -> an signed 8-bit number.
        //  short -> a signed 2 byte number.
        //  int -> a signed 4 byte number.
        //  long -> a signed 8 byte number.
        //  boolean -> boolean value (true/false).
        //  char -> a single character.

        // Objects:
        //  String -> a string of characters.
        //  null -> The absence of an Object.

        // Java has very similar (but not exact) identifier naming conventions as Python.
        // The main difference is the naming convention where camelCase is used for variables/methods.

        var myCamelCasedVariable = 3.14;
        var myTruncatedCamelCasedVariable = (int) myCamelCasedVariable; // Can explicitly instruct the compiler to cast.
        System.out.println(myTruncatedCamelCasedVariable);
        System.out.println();

        // Sometimes variables are casted implicitly!
        System.out.println(3 * 4.0); // Here the 3 gets implicitly casted to a floating-point value!

        // Java supports (real) constants out-of-the-box!
        final var MY_CONSTANT = 7;
        
        // MY_CONSTANT = 8; // This would cause a compilation error if commented out.

        BigInteger bigInt = new BigInteger("239582464738945982594857298572984539485629875648579348673958673958637730986730986730598637058");

        System.out.println(bigInt.add(bigInt));
        System.out.println();

        System.out.println(Math.sqrt(4));
    }
}
