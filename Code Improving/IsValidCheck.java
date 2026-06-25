/**
 * @author Jon Mrowczynski
 */
void main() {
    final var nullString = null;
    IO.println("""
            Null checks:
                %b
                %b
            """.formatted(isValidCheckLong(nullString), isValidCheckShort(nullString)));

    final var emptyString = "\t \n";
    IO.println("""
            Empty String checks:
                %b
                %b
            """.formatted(isValidCheckLong(emptyString), isValidCheckShort(emptyString)));

    final var validString = "I should be valid!";
    IO.println("""
            Non-empty String checks:
                %b
                %b
            """.formatted(isValidCheckLong(validString), isValidCheckShort(validString)));
}

boolean isValidCheckLong(final String input) {
    if (input == null) { return false; }
    if (input.trim().length() == 0) { return false; }
    return true;
}

/**
 * Functionally equivalent to {@link IsValidCheck#isValidCheckLong(String)}, but more concise.
 */
boolean isValidCheckShort(final String input) {
    return input != null && !input.isBlank();
}