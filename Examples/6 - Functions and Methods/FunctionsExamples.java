public class FunctionsExamples {
    public static void main(String[] args) {
        // passByValueExample();
        // System.nanoTime();
        // createNewArray(null);

        NestedClass1.myFunc();

        // void -> Nothing should be expected.
        // null -> Absence of an object reference. 
        // methodOverloadingExample();
    }

    private static void passByValueExample() {
        var result = Math.log10(10); // This is a function call! Doesn't require an object. Can be called directly from a class.
        System.out.println(result);
        add2Wrong(result); // Pass-by-value. So doesn't update.
        System.out.println(result);
        result = add2Correct(result);
        add2Correct(result);
        System.out.println(result);
    }

    private static void add2Wrong(double myDouble) {
        myDouble += 2;
    }

    private static double add2Correct(double myDouble) {
        return myDouble + 2;
    }

    /**
     * 
     * @param ints
     */
    private static void add2Correct(int[] ints) {
        for (var i = 0; i < ints.length; ++i) {
            ints[i] += 2;
        }
    }

    /**
     * Here goes some useful information about how to use this function.
     * 
     * @param array the array that is used as a template to generate a new array.
     * @return the newly generated array.
     */
    private static int[] createNewArray(int[] array) {
        if (array == null) { return null; }
        var newArray = new int[array.length];
        for(var i = 0; i < array.length; ++i) {
            newArray[i] = 7;
        }
        array = newArray;
        return newArray;
    }
}