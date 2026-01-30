import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Need a bit more ceremonial code here for Java, which is kind of a gift and a curse.
 * 
 * @author Jon Mrowczynski
 * Java Version: 21.0.9
 */
public class Loops {
    public static void main(String[] args) {

        var condition = true;
        while(condition) { // Basically just executes code until condition becomes false.
            System.out.println("Execute stuff here until condition is false.");
            condition = false;
        }
        System.out.println();

        int[] array = {1, 2, 3};
        // Have a for-each loop.
        for (var item : array) {
            System.out.println(item);
            item = -1; // This doesn't change any of the item values because in a for-each loop.
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        // But can also have genuine indexed for loops!
        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
            if (array[i] == 2) {
                array[i] = -1; // Can change the value of an item because in an indexed for loop!
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        // Also have something very powerful called Streams (which are a bit more advanced)!
        // However, these offer a much more functional/declarative way to implement loops (and more complex operations as well).
        IntStream.range(0, array.length).forEach(System.out::println);
        System.out.println();

        // "else" after a loop is not supported. :(

        // Can "continue" if you want to stop executing just an iteration of the loop.
        for (int i = 0; i < 3; ++i) {
            if (i == 1) { continue; } // This skips the printing if i == 1!
            System.out.println(i);
        }
        System.out.println();

        // Also has a "do-while" loop, which is just like a "while" loop, but the condition is checked at the end instead of the
        // beginning.
        condition = false;
        do {
            System.out.println("This still gets executed even though condition == false!");
        } while(condition); // Keep on executing until condition is false.
        System.out.println("But since the condition == false, it doesn't get executed again.");
    }
}