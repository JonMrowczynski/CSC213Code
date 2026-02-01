/**
 * @author Jon Mrowczynski
 */
public class IsValidCheck {

    public static void main(String[] args) {
        System.out.println("Null checks:");
        System.out.println(IsValidCheckLong.isValidCheck(null));
        System.out.println(IsValidCheckShort.isValidCheck(null));

        System.out.println();

        System.out.println("Empty String check:");
        System.out.println(IsValidCheckLong.isValidCheck(""));
        System.out.println(IsValidCheckShort.isValidCheck(""));

        System.out.println();

        System.out.println("Valid String check:");
        System.out.println(IsValidCheckLong.isValidCheck("I should be valid!"));
        System.out.println(IsValidCheckShort.isValidCheck("I should be valid!"));
    }

    public class IsValidCheckLong {
        public static boolean isValidCheck(String input) {
            if (input == null) { return false; }
            if (input.trim().length() == 0) { return false; }
            return true;
        }
    }

    public class IsValidCheckShort {
        public static boolean isValidCheck(String input) {
            return input != null && input.trim().length() != 0;
        }
    }
}

