package shapes.impl2;

/**
 * @author Jon Mrowczynski
 */
public class Circle extends Shape {
    public Circle(String name, double radius) {
        super(name); // Calls the superclass's constructor.
        area = Math.PI * radius * radius;
        perimeter = 2 * Math.PI * radius;
    }
}