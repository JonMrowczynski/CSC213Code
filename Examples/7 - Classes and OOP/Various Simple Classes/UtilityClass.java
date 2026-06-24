/**
 * 
 * @author Jon Mrowczynski
 */
public class UtilityClass {

    private UtilityClass() throws InstantiationException { 
        throw new InstantiationException("Can't make new instances of UtilityClass."); 
    }

    void main() { // Can still have a main method here if you want, although it's rather unusual...
        // final var clazz = new UtilityClass(); // Don't even want to do this, which is why constructor is private.
    }

    // Have many useful static methods and constants here.

}