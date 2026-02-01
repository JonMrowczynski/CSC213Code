/**
 * @author Justin Del Vecchio
 * @author Jon Mrowczynski
 */
public class MathExamples{

    public static void main(String[] args){
        printFloatingPointNumericErrorExample();
        printFloatDivisionByZeroExamples();
        printFloatZeroDividedByZero();
        printIntDivisionByZero();
    }

    private static void printFloatingPointNumericErrorExample(){
        System.out.println(2.0-1.7);
        System.out.println();
    }

    private static void printFloatDivisionByZeroExamples(){
        System.out.println(10.0 / 0.0); // Positive Infinity
        System.out.println(-10.0 / 0.0); // Negative Infinity
        System.out.println();
    }

    private static void printFloatZeroDividedByZero(){
        System.out.println(0.0 / 0.0); // Not a Number or NaN
        System.out.println();
    }

    private static void printIntDivisionByZero(){
        System.out.println(10 / 0); // Should be positive infinity, but causes an exception!
        System.out.println();
    }

}