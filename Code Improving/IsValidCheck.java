/**
 * @author Jon Mrowczynski
 */
public class IsValidCheck {

    public static void main(String[] args) {
        System.out.println("Null checks:");
        System.out.println("\t" + isValidCheckLong(null));
        System.out.println("\t" + isValidCheckShort(null));

        System.out.println();

        System.out.println("Empty String checks:");
        System.out.println("\t" + isValidCheckLong("\t \n"));
        System.out.println("\t" + isValidCheckShort("\t \n"));

        System.out.println();

        System.out.println("Valid String checks:");
        System.out.println("\t" + isValidCheckLong("I should be valid!"));
        System.out.println("\t" + isValidCheckShort("I should be valid!"));
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
        return input != null && !input.isBlank();
    }
}