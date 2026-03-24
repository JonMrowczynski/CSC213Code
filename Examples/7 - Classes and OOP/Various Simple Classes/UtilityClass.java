public class UtilityClass {

    private UtilityClass() {
        throw new InstantiationException("Can't make new instances of UtilityClass.");
    }

    public static void main(String[] args) {
        var clazz = new UtilityClass();
    }

}