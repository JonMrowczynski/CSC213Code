import java.util.Arrays;

/**
 * @author Jon Mrowczynski
 */
public class ArrayExamples {
    
    public static void main(String[] args) {
        stringsAsCharArrays();

        // If you don't know what the values will be ahead of time, then just allocate the space for them.
        int[] ints = new int[10];
        printArray(ints);
        double[] doubles = new double[10];
        printArray(doubles);

        // Can have higher-order arrays!
        int[][] matrix = new int[2][3]; // 2D array
        printMatrix(matrix);
        matrix[1][2] = -1;
        printMatrix(matrix);
    }

    /**
     * Shows that a String is just a char[] behind the scenes! There are various ways to instantiate arrays. If you know the
     * values ahead of time (like for the myChars array), then just declare them!
     */
    private static void stringsAsCharArrays() {
        var myString = "Hello World!";
        System.out.println("Printing the String: " + myString + "\n");

        char[] myChars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        System.out.print("Printing the char array: ");
        System.out.println(myChars);
        System.out.println("\n");

        System.out.println("Arrays.equals(myString.toCharArray(), myChars) ? -> " + Arrays.equals(myString.toCharArray(), myChars));
        System.out.println();
    }

    /**
     * Prints an array (1D tensor) of {@code int}s.
     * 
     * @param array the array to be printed.
     */
    private static void printArray(int[] array) {
        System.out.println("Printing Array: " + Arrays.toString(array));
    }

    /**
     * Prints an array (1D tensor) of {@code double}s
     * 
     * @param array the array to be printed.
     */
    private static void printArray(double[] array) {
        System.out.println("Printing Array: " + Arrays.toString(array));
    }

    /**
     * Prints a matrix (2D tensor) of {@code int}s.
     * 
     * @param matrix the matrix to be printed.
     */
    private static void printMatrix(int[][] matrix) {
        System.out.println("\nPrinting Matrix:");
        for (int[] arr : matrix) { printArray(arr); }
    }

    /**
     * Prints a 3D tensor of {@code int}s.
     * 
     * @param tensor the tensor to be printed.
     */
    private static void printTensor(int[][][] tensor) {
        System.out.println("\nPrinting Tensor:");
        for (int[][] matrix : tensor) { printMatrix(matrix); }
    }
}