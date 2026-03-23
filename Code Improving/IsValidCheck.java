/**
 * @author Jon Mrowczynski
 */
public class IsValidCheck {

    public static void main(String[] args) {
        System.out.println("Null checks:");
        System.out.println(isValidCheckLong(null));
        System.out.println(isValidCheckShort(null));

        System.out.println();

        System.out.println("Empty String checks:");
        System.out.println(isValidCheckLong("\t \n"));
        System.out.println(isValidCheckShort("\t \n"));

        System.out.println();

        System.out.println("Valid String checks:");
        System.out.println(isValidCheckLong("I should be valid!"));
        System.out.println(isValidCheckShort("I should be valid!"));
    }

    public static boolean isValidCheckLong(String input) {
        if (input == null) { return false; }
        if (input.trim().length() == 0) { return false; }
        return true;
    }

    /**
     * Functionally equivalent to {@link IsValidCheck#isValidCheckLong(String)}, but more concise. 
     * <p>
     * Worked out in class!
     */
    public static boolean isValidCheckShort(String input) {
        return !(input == null || input.trim().length() == 0);
    }
}