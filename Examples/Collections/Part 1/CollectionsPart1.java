import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

/**
 * Intro to Java Collections.
 * 
 * @author Jon Mrowczynski
 */
public class CollectionsPart1 {

    public static void main(String[] args) {
        ArrayListExamples();
        LinkedListExamples();
        SetExamples();
        MapExamples();
        CollectionsExamples();
    }

    /**
     * Very similar to a {@link LinkedList}. A few differences include: 
     *  - It's indexable such that any acquisitions are O(1).
     *  - When elements are added, it's O(1) amortized. Meaning the average time complexity is O(1).
     *      - This is because a new array may need to be allocated!
     *  - If elements are removed from the beginning, the entire rest of the contents have to be shifted over!
     */
    private static void ArrayListExamples() {
        System.out.println("In ArrayListExamples:");
        ArrayList<Integer> list = new ArrayList<Integer>(); // Don't need "Integer" twice, but kept here for demo.
        list.add(1);
        list.add(10);
        list.add(3);
        System.out.println("\tArrayList after adding: " + list); // Can just directly print the data structure!
        System.out.println("\tThe element at index 1 is: " + list.get(1));

        final var removeByIndex = true; // Change me!
        if (removeByIndex) {
            list.remove(1); // Or remove the element at the corresponding index if known. O(1)
        } else {
            list.remove(Integer.valueOf(10)); // Can either remove the Object: O(n)
        }

        System.out.println("\tArrayList after removal: " + list);
        System.out.println("\tThe element at index 1 is now: " + list.get(1));
        list.clear();
        System.out.println("\tArrayList after clearing: " + list);
        System.out.println();
    }

    /**
     * Very similar to an {@link ArrayList}. A few differences include:
     *  - It's still "indexable", but the {@link LinkedList} has to be traversed over to get the ith element. Meaning
     *    acquisitions are O(n).
     *  - When elements are added, they are reliably done so in O(1) time.
     *  - If elements are removed from the beginning, then just the head reference is removed which takes O(1) time.
     * 
     * There are two main types of {@LinkedList}s:
     *  - Singly-linked lists (SSL)
     *      - Each node contains a reference to the data and the next node.
     *      - Uses less memory.
     *      - Only can traverse in one direction. -> Inserting/removing at end takes O(n).
     *  - Double-linked lists (DLL)
     *      - Each node contains a reference to the data, the next node, and the previous node.
     *      - Uses more memory.
     *      - Can traverse in BOTH directions! -> Inserting.removing at end takes O(1).
     * Java's LinkedList is a DLL.
     */
    private static void LinkedListExamples() {
        System.out.println("In LinkedListExamples:");
        LinkedList<Integer> list = new LinkedList<>(); // Integer is only included once here.
        // Can call add() just like with an ArrayList, but can now add to the beginning or the end of the List.
        // Calling addLast is equivalent to calling add and vice versa.
        list.addFirst(10);
        list.addFirst(1);
        list.addLast(3); // This is an equivalent call to add();
        System.out.println("\tLinkedList after adding: " + list); // Can just directly print the data structure!
        System.out.println("\tThe element at index 1 is: " + list.get(1));

        final var removeByIndex = true; // Change me!
        if (removeByIndex) {
            list.remove(1); // Or remove the element at the corresponding index if known. O(n)
        } else {
            list.remove(Integer.valueOf(10)); // Can either remove the Object: O(n)
        }

        System.out.println("\tLinkedList after removal: " + list);
        System.out.println("\tThe element at index 1 is now: " + list.get(1));
        // Have special removeFirst and removeLast calls with a LinkedList
        list.removeFirst();
        list.removeLast();
        System.out.println("\tLinkedList after clearing: " + list);
        System.out.println();        
    }

    /**
     * A {@link HashSet}:
     *  - Usually desired when you care about the uniqueness of the added items.
     *  - Adding to a {@link HashSet} is amortized O(1).
     *      - Hashing is O(1) to determine which bucket to store the elements in.
     *      - Depending on the bucket implementation and the data types of the stored elements, this performance can be either
     *        O(k) or O(log(k)) where k is the number of elements in the bucket.
     */
    private static void SetExamples() {
        System.out.println("In SetExamples:");
        var set = new HashSet<Integer>();
        set.add(42);
        set.add(42); // Can't add multiple instances of the same thing!
        System.out.println("\tHashSet after adding 42 twice: " + set);
        set.add(3);
        set.add(7);
        System.out.println("\tHashSet doesn't guarantee insertion order: " + set);
        System.out.println();
    }

    /**
     * A {@link HashMap} stores key-value pairs, where it:
     *  - Works similarly to a {@link HashSet} when storing the keys where every key is unique!
     *  - You can "get" the corresponding value associated with a key.
     *  - If you are not sure if a key is in the {@link HashMap}, then can return a default instead!
     */
    private static void MapExamples() {
        System.out.println("In MapExamples:");
        var map = new HashMap<String, Double>();
        map.put("My First String", 42.0);
        map.put("PI", Math.PI);
        map.put("pi", Math.PI); // Remember case sensitivity!
        System.out.println("HashMap after insertions: " + map);
        System.out.println("Get a value with a key: " + map.get("PI"));
        System.out.println("Get a value or a default if key not in Map: " + map.getOrDefault("E", Math.E));
        map.put("PI", 3.14);
        System.out.println("HashMap after overwriting \"PI\" key: " + map); 
        System.out.println();
    }

    /**
     * Similar to the utility class {@link Arrays} that contains a bunch of helper functions that helps us work with arrays, we
     * have a utility class called {@link Collections} that helps us work with collections!
     */
    private static void CollectionsExamples() {
        System.out.println("In CollectionsExamples:");
        var list = new ArrayList<Integer>();
        Collections.addAll(list, 4, 8, 10, -1, -7, 5); // Can add a bunch of elements in one go.
        System.out.println("\tList before sorting: " + list);
        Collections.sort(list); // Can efficiently sort the Collection!
        System.out.println("\tList after sorting: " + list);
        System.out.println("\tPrinting the elements out individually:");
        // Can use either an indexed for loop (if Collection is indexable) and/or a for each loop!
        for (var integer : list) { System.out.println("\t\t" + integer); }
        System.out.println();
    }
}