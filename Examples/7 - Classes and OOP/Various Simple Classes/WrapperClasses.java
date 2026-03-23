/**
 * Java has what are called Wrapper classes that "wraps" each of its primitives into corresponding Objects (double -> Double,
 * int -> Integer, etc.) to allow for primitives to be used in an OOP context. 
 * 
 * @author Jon Mrowczynski
 */
public class WrapperClasses {

    public static void main(String[] args) {
        compareDoubleObjects();
        compareDoubleObjectToPrimitive();
        methodsOfDouble();
    }

    /**
     * Makes some comparisons among various Double objects showing that they are really
     */
    private static void compareDoubleObjects() {
        Double d1 = 2.0;
        Double d2 = 2.0;
        Double d3 = d1;
        System.out.println("""
                Comparing Double Objects:
                d1 == d2 ? -> %s
                d1.equals(d2) ? -> %s
                d1 == d3 ? -> %s
                d1.equals(d3) ? -> %s
                """.formatted(d1 == d2, d1.equals(d2), d1 == d3, d1.equals(d3)));
    }

    /**
     * Compares a Double object to a double primitive.
     */
    private static void compareDoubleObjectToPrimitive() {
        Double d1 = 2.0;
        double d2 = 2.0;
        System.out.println("""
                Comparing Double Object to double primitive:
                d1 == d2 ? -> %s (Double Object implicitly unboxed (or unwrapped) to a double primitive!)
                d1.equals(d2) ? -> %s
                """.formatted(d1 == d2, d1.equals(d2)));
    }

    /**
     * Shows just a few examples of some of the other methods that you can call on a Double object.
     */
    private static void methodsOfDouble() {
        Double d = 3.14;
        System.out.println("""
                doubleValue() -> %f
                d.isInfinite() -> %b
                d.intValue() -> %d
                """.formatted(d.doubleValue(), d.isInfinite(), d.intValue()));

    }

}