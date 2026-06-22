import java.util.Arrays;

/**
 * @author Jon Mrowczynski
 */
void main() {
    stringsAsCharArrays();

    // If you don't know what the values will be ahead of time just allocate space for them. Can always later assign.
    int[] ints = new int[10];
    printArray(ints);
    Arrays.fill(ints, 87); // Can fill the entire array with a different value, for example!
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
    // But wait... doesn't an element in an array have to have the same size...and this size is allocated when the array
    // is made...so how is this possible...?
    // The *references* to the characters are stored, not the characters directly!

    var myStr = "Hello!"; // Are immutable
    char[] myChars = {'H', 'e', 'l', 'l', 'o', '!'}; // Are mutable
    myChars[3] = 'p';
    myChars[4] = '!';
    myChars[5] = '\0';
    IO.println(Arrays.toString(myChars) + " -> " + new String(myChars));

    double[] doubles = {1, 2, 3};
    forEachLoop(doubles);
    indexedForLoop(doubles);
}

/**
 * Shows that a String is just a char[] behind the scenes! There are various ways to instantiate arrays. If you know the
 * values ahead of time (like for the myChars array), then just declare them!
 */
void stringsAsCharArrays() {
    var myString = "Hello World!";
    IO.println("Printing the String: " + myString);
    char[] myChars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
    IO.println("Printing the char array: " + myChars);
    IO.println("Arrays.equals(myString.toCharArray(), myChars) ? -> " + Arrays.equals(myString.toCharArray(), myChars));
    IO.println();
}

/**
 * Prints an array (1D tensor) of {@code int}s.
 * 
 * @param array the array to be printed.
 */
void printArray(int[] array) {
    IO.println("Printing Array: " + Arrays.toString(array));
}

/**
 * Prints a matrix (2D tensor) of {@code int}s.
 * 
 * @param matrix the matrix to be printed.
 */
void printMatrix(int[][] matrix) {
    IO.println("\nPrinting Matrix:");
    for (int[] arr : matrix) { printArray(arr); }
}

/**
 * Can iterate over arrays and Iterables, but can only be used to iterate! Modifying the lop variable just modifies
 * the copy of the value, not the value in the array itself! So, you can't modify the array with a for-each loop!
 * 
 * @param doubles the array being iterated over.
 */
void forEachLoop(double[] doubles) {
    IO.println("\nPrinting array with for-each loop:");
    for (var f : doubles) {
        f = 1.0;
        IO.println(f);
    }
    IO.println("Final array: " + Arrays.toString(doubles));
}

/**
 * Can iterate over any indexable collection (like arrays) and can modify the values in the array since accessing the 
 * actual elements of the array.
 * 
 * @param doubles the array being iterated over.
 */
void indexedForLoop(double[] doubles) {
    IO.println("\nPrinting array with indexed for loop:");
    for (var i = 0; i <= doubles.length - 1; ++i) {
        IO.println(doubles[i]);
        doubles[i] = 1.0;
    }
    IO.println("Final array: " + Arrays.toString(doubles));
}