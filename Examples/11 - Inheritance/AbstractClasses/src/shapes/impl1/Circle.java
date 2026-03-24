package shapes.impl1;

/**
 * @author Jon Mrowczynski
 */
public class Circle extends Shape {
    private final double r;

    public Circle(String name, double radius) {
        super(name); // Calls the superclass's constructor.
        r = radius; 
    }

    @Override public double getArea() { return Math.PI * r * r; }
    @Override public double getPerimeter() { return 2 * Math.PI * r; }
    
    private double getArea(double something) {
        return 0.0;
    }
}