import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Need a bit more ceremonial code here for Java, which is kind of a gift and a curse.
 * 
 * Java doesn't have support for else statements with respect to loops.
 * 
 * @author Jon Mrowczynski
 * Java Version: 21.0.9
 */
public class Loops {
    public static void main(String[] args) {
        whileLoopExample();

        int[] array = {1, 2, 3};
        forEachLoopExample(array);
        indexedForLoopExample(array);

        continueAndBreakExample();
        
        doWhileLoopExample();

        streamExample(array);
    }

    /**
     * While loop basically just executes code until the loop condition becomes false.
     */
    private static void whileLoopExample() {
        System.out.println("While Loop Example:");
        var condition = true;
        while(condition) {
            System.out.println("Execute stuff here until condition is false.");
            condition = false;
        }
        System.out.println();
    }

    /**
     * A for-each loop can iterate over any array or {@link Iterable}. Great for printing or searching, but not for altering array.
     * 
     * @param array the array to demo.
     */
    private static void forEachLoopExample(int[] array) {
        System.out.println("For Each Loop Example:");
        for (var item : array) {
            System.out.println(item);
            item = -1; // While this changes the value of the local copy of the array's value, it doesn't change the original value!
            System.out.println(item);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    /**
     * An indexed for loop over any array. Good general purpose use, but more verbose. Can alter the contents of the array!
     * 
     * @param array the array to be demoed
     */
    private static void indexedForLoopExample(int[] array) {
        System.out.println("Indexed For Loop Example:");
        // But can also have genuine indexed for loops! These contain 3 statements in the ()
        // 1. The loop variable initialization statement.
        // 2. The loop condition.
        // 3. The loop variable update statement
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
            if (array[i] == 2) {
                array[i] = -1; // Can change the value of an item because accessing actual item.
                System.out.println(array[i]);
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();
    }

    private static void continueAndBreakExample() {
        System.out.println("Continue and Break Example:");
       // Can "continue" if you want to stop executing just an iteration of the loop.
        // Can "break" if you want to exit the loop entirely.
        for (int i = 0; i < 100; ++i) {
            if (i > 3 || i < 90) { continue; } // This skips the printing if i == 1!
            if (i == 93) { break; }
            System.out.println(i);
        }
        System.out.println();
    }

    /**
     * Java has a "do-while" loop, which is just a "while" loop, but the condition is checked at the end instead of the beginning.
     */
    private static void doWhileLoopExample() {
        System.out.println("Do-while Loop Example:");
        var condition = false;
        do {
            System.out.println("This still gets executed even though condition == false!");
        } while(condition); // Keep on executing until condition is false.
        System.out.println("But since the condition == false, it doesn't get executed again.");
    }

    /**
     * Have Streams, which are a bit more advanced, but quite powerful! These offer a much more functional/declarative way to
     * implement loops in addition to more complex operations.
     */
    private static void streamExample(int[] array) {
        System.out.println("Stream \"Loop\" Example:");
        IntStream.range(0, array.length).forEach(System.out::println);
        System.out.println();
    }
}