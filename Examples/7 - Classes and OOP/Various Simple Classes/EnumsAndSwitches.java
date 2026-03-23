/**
 * Contains a few examples of using enums and switches. While switches don't have to be used with enums, it is rather common.
 * Compare if-else if-else statements, switch statements, switch expression that returns void and switch expressions that return a value.
 * 
 * @author Jon Mrowczynski
 */
public class EnumsAndSwitches {

    /**
     * The message that should be printed on Mondays.
     */
    private static final String MONDAY_MSG = "Help me.";

    /**
     * The message that should be printed on mid-week days including Tuesdays, Wednesdays, and Thursdays.
     */
    private static final String MID_WEEK_MSG = "Just another day in the office.";

    /**
     * The message that should be printed on Fridays.
     */
    private static final String FRIDAY_MSG = "TGIF!";

    /**
     * The message that should be printed on weekend days including Saturdays and Sundays.
     */
    private static final String WEEKEND_MSG = "Everybody's workin' for the weekend";

    /**
     * The message that should be printed otherwise. If all cases are handled in the switches, then this will never fire.
     * However, it is possible to expand our enums later in development, which is why it's always a good idea to include a
     * default case even if you don't initially need it! 
     */
    private static final String DEFAULT_MSG = "Encountered unhandled DaySimple! :O";

    /**
     * - An enum can be thought of as a special kind of class where you know all possible states ahead of time.
     * - All possible enum instances are instantiated by the JVM ahead-of-time and there can only ever be one instance!
     * - It is not possible to manually instantiate new enum objects. 
     * - The most basic kind of enum is shown below in {@link DaySimple}.
     * - A Few advantageous of enums include:
     *  1. Both the programmer AND the computer knows ALL possible enum values.
     *  2. Helps the compiler and IDE help the programmer to write cleaner, more robust, and efficient code.
     * 
     * @author Jon Mrowczynski
     */
    private enum DaySimple { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY; }

    public static void main(String[] args) {
        System.out.println("Printing all possible values of " + DaySimple.class.getSimpleName() +":");
        for (var day : DaySimple.values()) { 
            System.out.println(day + "'s ordinal value is: " + day.ordinal()); 
        }
        System.out.println();

        final var day = DaySimple.MONDAY; // Change me!

        ifElseStatements(day);
        switchStatement(day);
        switchExpressionWithVoidReturn(day);
        System.out.println(switchExpressionWithReturnedValue(day));
    }

    /**
     * A functionally equivalent way to use if-else if-else statements to accomplish what is done in {@link EnumsAndSwitches#switchStatement(DaySimple)}.
     * 
     * While it uses simple ideas, it tends to yield much more verbose code. Additionally, EVERY logical check has to be made as
     * you do down the chain. For example, if FRIDAY is passed in for {@code day}, then a check is made to see if
     * {@code day == DaySimple.MONDAY}. If not, then another check is made to see if {@code day == DaySimple.TUESDAY}. If not, then another check is
     * made...until we get to the check {@code day == DaySimple.FRIDAY}, in which case, the corresponding print statement is made. 
     * 
     * This tends to yield inefficient code, since multiple checks usually have to be made upon each call of this function.
     * 
     * @param day the {@link DaySimple} used for demo purposes.
     */
    private static void ifElseStatements(DaySimple day) {
        if (day == DaySimple.MONDAY) {
            System.out.println(MONDAY_MSG);
        } else if (day == DaySimple.TUESDAY || day == DaySimple.WEDNESDAY || day == DaySimple.THURSDAY) {
            System.out.println(MID_WEEK_MSG);
        } else if (day == DaySimple.FRIDAY) {
            System.out.println(FRIDAY_MSG);
        } else if (day == DaySimple.SATURDAY || day == DaySimple.SUNDAY) {
            System.out.println(WEEKEND_MSG);
        } else { // Not needed if there is a check for all possible values!
            System.out.println(DEFAULT_MSG);
        }
    }

    /**
     * A functionally equivalent way to accomplish what is done in {@link EnumsAndSwitches#ifElseStatements(DaySimple)}.
     * 
     * However, here we can simply just "jump" to the code that we want to execute based on the value of {@code day}. Therefore,
     * if {@code day == DaySimple.FRIDAY}, then we just "goto" the code that we want to run when
     * {@code day == DaySimple.FRIDAY}. This not only helps to make the code more readable, but also more efficient! The break
     * keyword is used to break out of the switch statement. If break, is not called, then the execution of the program simply
     * passes-through to the next case. That's why the same code is executed for TUESDAY, WEDNESDAY, AND THURSDAY, for example.
     * 
     * @param day the {@link DaySimple} used for demo purposes.
     */
    private static void switchStatement(DaySimple day) {
        switch(day) {
            case MONDAY:
                System.out.println(MONDAY_MSG);
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println(MID_WEEK_MSG);
                break;
            case FRIDAY: 
                System.out.println(FRIDAY_MSG);
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println(WEEKEND_MSG);
                break;
            default: // Not needed if there is a case for all possible values!
                System.out.println(DEFAULT_MSG);
        }
    }

    /**
     * A functionally equivalent way to accomplish what is done in {@link EnumsAndSwitches#switchStatement(DaySimple)}, but
     * significantly less verbose using Java's switch expressions. An expression is similar to a statement, except that it
     * returns a value. However, we don't necessarily have to return a value! Whenever we don't want to do so, we simply
     * "return" void, which is what is done here.
     * 
     * @param day the {@link DaySimple} used for demo purposes.
     */
    private static void switchExpressionWithVoidReturn(DaySimple day) {
        switch(day) {
            case MONDAY -> System.out.println(MONDAY_MSG);
            case TUESDAY, WEDNESDAY, THURSDAY -> System.out.println(MID_WEEK_MSG);
            case FRIDAY -> System.out.println(FRIDAY_MSG);
            case SATURDAY, SUNDAY -> System.out.println(WEEKEND_MSG);
            default -> System.out.println(DEFAULT_MSG); // Not needed if there is a case for all possible values!
        }
    }

    /**
     * Similar in functionality to the other functions, however, it entirely removes the repetitive print statements contained
     * in the previous functions. This also allows for more flexibility in terms of what is done with the message since we
     * aren't necessarily printing it by default.
     * 
     * @param day the {@link DaySimple} used for demo purposes.
     * @return a {@link String} whose message 
     */
    private static String switchExpressionWithReturnedValue(DaySimple day) {
        return switch(day) {
            case MONDAY -> MONDAY_MSG;
            case TUESDAY, WEDNESDAY, THURSDAY -> MID_WEEK_MSG;
            case FRIDAY -> FRIDAY_MSG;
            case SATURDAY, SUNDAY -> WEEKEND_MSG;
            default -> DEFAULT_MSG; // Not needed if there is a case for all possible values!
        };
    }

    /**
     * Since enums are effectively just special classes...you can use OOP ideas on them as well! Still all the same rules apply
     * as in our {@link DaySimple} enum. It's just that we've added a constructor to initialize the instance fields and a getter
     * method. We can even override methods!
     * 
     * A little bit more than what we will get into, but it is good to know that you can do this!
     * 
     * @author Jon Mrowczynski
     */
    private enum DayComplex {

        MONDAY("Monday", 0),
        TUESDAY("Tuesday", 3),
        WEDNESDAY("Wednesday", 2),
        THURSDAY("Thursday", 4),
        FRIDAY("Friday", 6),
        SATURDAY("Saturday", 10),
        SUNDAY("Sunday", 8);

        private final String userFriendlyName;
        private final int preference;

        private DayComplex(String name, int pref) {
            userFriendlyName = name;
            preference = pref;
        }

        @Override public String toString() { return userFriendlyName; }

        public final int getPreference() { return preference; }
    };
}