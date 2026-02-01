import java.util.Arrays;

public class ArrayExamples {
    
    public static void main(String[] args) {

        var myString = "Hello World!";
        System.out.println("Printing the String: " + myString + "\n");

        // There are various ways to instantiate arrays
        // If you know the values ahead of time, just declare them!
        char[] myChars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        System.out.print("Printing the char array: ");
        System.out.println(myChars);
        System.out.println("\n");

        // If you don't know what the values will be ahead of time, then just allocate the space for them.
        int[] myInts = new int[100];

        System.out.println("Printing with a for-each loop");
        // For each loop is desirable if only accessing elements.
        for (char c : myChars) {
            c = 'T';
            System.out.print(c); 
        }
        System.out.println("\n");
        System.out.println(myChars);

        // Each for loop requires 3 statements
        // 1. Initialization
        // 2. Condition
        // 3. loop variable modification 
        for (int i = 0; i <= 9; ++i) {
            System.out.println(i);
        } // indexed for loop is desirable if 
        // 1. Need to modify elements
        // 2. Care about learning positional information.
        for (int i = 0; i < myChars.length; ++i) {
            if (myChars[i] == 'W') {
                System.out.println("Found a 'W' at index: " + i + " replacing with T");
                myChars[i] = 'T';
            }
        }
        System.out.println(myChars);

        // Can have higher-order arrays!
        // 2D array
        int[][] matrix = new int[2][3];
        printMatrix(matrix);
        matrix[1][2] = -1;
        printMatrix(matrix);
    }

    private static void stringsAsCharArrays() {

    }


    /**
     * Prints an array (1D tensor) of {@code int}s.
     * 
     * @param array the array to be printed.
     */
    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    /**
     * Prints a matrix (2D tensor) of {@code int}s.
     * 
     * @param matrix the matrix to be printed.
     */
    private static void printMatrix(int[][] matrix) {
        System.out.println("\nMatrix:");
        for (int[] arr : matrix) { printArray(arr); }
    }

    /**
     * Prints a 3D tensor of {@code int}s.
     * 
     * @param tensor the tensor to be printed.
     */
    private static void printTensor(int[][][] tensor) {
        System.out.println("Tensor:");
        for (int[][] matrix : tensor) { printMatrix(matrix); }
    }

}