package shapes.impl1;

/**
 * @author Jon Mrowczynski
 */
public final class Square extends Rectangle {
    public Square(String name, double sideLength) {
        super(name, sideLength, sideLength); // Call's the superclass's (Rectangle's) constructor.
    }
}