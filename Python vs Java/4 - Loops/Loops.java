import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Need a bit more ceremonial code here for Java, which is kind of a gift and a curse.
 * 
 * Java doesn't have support for else statements with respect to loops.
 * 
 * Java Version: 25.0.3
 * 
 * @author Jon Mrowczynski
 */
void main() {
    whileLoopExample();

    int[] array = {1, 2, 3};
    forEachLoopExample(array);
    indexedForLoopExample(array);

    continueAndBreakExample();
    
    doWhileLoopExample();

    streamExample(array); // O_o!?
}

/**
 * While loop basically just executes code until the loop condition becomes false.
 */
void whileLoopExample() {
    IO.println("While Loop Example:");
    var condition = true;
    while(condition) {
        IO.println("Execute stuff here until condition is false.");
        condition = false;
    }
    IO.println();
}

/**
 * A for-each loop can iterate over any array or {@link Iterable}. Great for printing or searching, but not for altering array.
 * 
 * @param array the array to demo.
 */
void forEachLoopExample(int[] array) {
    IO.println("For Each Loop Example:");
    for (var item : array) {
        IO.println(item);
        item = -1; // While this changes the value of the local copy of the array's value, it doesn't change the original value!
        IO.println(item);
    }
    IO.println(Arrays.toString(array));
    IO.println();
}

/**
 * An indexed for loop over any array. Good general purpose use, but more verbose. Can alter the contents of the array!
 * These must contain 3 statements (listed from left to right):
 * 1. The loop variable initialization statement.
 * 2. The loop condition.
 * 3. The loop variable update statement.
 * 
 * @param array the array to be demoed
 */
void indexedForLoopExample(int[] array) {
    IO.println("Indexed For Loop Example:");
    for (int i = 0; i < array.length; ++i) {
        IO.println(array[i]);
        if (array[i] == 2) {
            array[i] = -1; // Can change the value of an item because accessing actual item rather than a copy.
            IO.println(array[i]);
        }
    }
    IO.println(Arrays.toString(array));
    IO.println();
}

/**
 * Can continue if you want to stop executing just an iteration of the loop, but not exit out of it. Can "break" if you want
 * to exit the loop entirely.
 */
void continueAndBreakExample() {
    IO.println("Continue and Break Example:");
    for (int i = 0; i < 100; ++i) {
        if (i > 3 || i < 90) { continue; } // This skips the printing if i == 1!
        if (i == 93) { break; }
        IO.println(i);
    }
    IO.println();
}

/**
 * Java has a "do-while" loop, which is just a "while" loop, but the condition is checked at the end instead of the beginning.
 */
void doWhileLoopExample() {
    IO.println("Do-while Loop Example:");
    var condition = false;
    do {
        IO.println("This still gets executed even though condition == false!");
    } while(condition); // Keep on executing until condition is false.
    IO.println("But since the condition == false, it doesn't get executed again.");
}

/**
 * Have Streams, which are a bit more advanced, but quite powerful! These offer a much more functional/declarative way to
 * implement loops in addition to more complex operations.
 */
void streamExample(int[] array) {
    IO.println("Stream \"Loop\" Example:");
    IntStream.range(0, array.length).forEach(IO::println);
    IO.println();
}