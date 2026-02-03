import java.util.Arrays;

public class ArrayExamples2 {
    public static void main(String[] args) {
        String myStr = "Hello!"; // Are immutable
        char[] myChars = {'H', 'e', 'l', 'l', 'o', '!'};

        double[] doubles = {1, 2, 3};
        // for each loop -> arrays, Iterables.
        // Can only be used to iterate.
        // for (var f : doubles) {
        //     f = 1.0;
        //     System.out.println(f);
        // }

        // indexed for loop
        // 1. loop variable initialization
        // 2. condition 
        // 3. Loop variable update
        for (var i = 0; i <= doubles.length - 1; ++i) {
            System.out.println(doubles[i]);
            doubles[i] = 1.0;
        }
        // System.out.println(Arrays.toString(doubles));
        String[] myStrings = {"abc", "123"};
        System.out.println(Arrays.toString(myStrings));
        int[] ints = new int[doubles.length];
        for (var i = 0; i < ints.length; ++i) {
            ints[i] = (int) doubles[i];
        }
        Arrays.fill(ints, 87);
        System.out.println(Arrays.toString(ints));
    }
}