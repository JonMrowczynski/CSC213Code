package shapes.impl1;

/**
 * @author Jon Mrowczynski
 */
public class Rectangle extends Shape {
    private final double l;
    private final double w;

    public Rectangle(String name, double length, double width) {
        super(name); // Call's the superclass's constructor.
        l = length;
        w = width;
    }

    @Override public double getArea() { return l * w; }
    @Override public double getPerimeter() { return 2 * l + 2 * w; }
}