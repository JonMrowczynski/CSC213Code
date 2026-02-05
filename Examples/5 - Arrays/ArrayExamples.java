import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Jon Mrowczynski
 */
public class ArrayExamples {
    
    public static void main(String[] args) {
        stringsAsCharArrays();

        // If you don't know what the values will be ahead of time, then just allocate the space for them. You can always assign
        // to them later.
        int[] ints = new int[10];
        printArray(ints);
        Arrays.fill(ints, 87); // Can fill the entire array with a different value!
        printArray(ints);

        // Can have higher-order arrays!
        int[][] matrix = new int[2][3]; // 2D array (or 2D tensor)
        printMatrix(matrix);
        matrix[1][2] = -1; // Change the last element in the matrix to -1.
        printMatrix(matrix);

        // Really, we can use arrays to represent what are called tensors!
        var myInt = 3; // 0D Tensor (scalar)
        int[] vector = new int[3]; // 1D Tensor (vector)
        // 2D tensor (matrix like what we saw above) 
        // 3D tensor and onwards are just called...well...tensors...

        int[][][][][][][] myTensor = new int[1][2][3][4][5][6][7]; // We can go crazy and create a 7D tensor...! O_O!
        // TODO: Can you print me in a pretty manner? Maybe with your own printing function?

        String[] myStrings = new String[3]; // Can also have arrays of objects!
        myStrings[0] = "A short String";
        myStrings[1] = "A very long String compared to the one above.";
        printArray(vector);
        // But wait... doesn't have element in an array have to have the same size...and this size is allocated when the array
        // is made...so how is this possible...?
        
        // A String stores the *reference* to the characters, not the characters directly!
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
     * Prints a matrix (2D tensor) of {@code int}s.
     * 
     * @param matrix the matrix to be printed.
     */
    private static void printMatrix(int[][] matrix) {
        System.out.println("\nPrinting Matrix:");
        for (int[] arr : matrix) { printArray(arr); }
    }
}