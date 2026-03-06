package shapes.impl2;

/**
 * @author Jon Mrowczynski
 */
public class Rectangle extends Shape {
    public Rectangle(String name, double length, double width) {
        super(name); // Call's the superclass's constructor.
        area = length * width;
        perimeter = 2 * length + 2 * width;
    }
}