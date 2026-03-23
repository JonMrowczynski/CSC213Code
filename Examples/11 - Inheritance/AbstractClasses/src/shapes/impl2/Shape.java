package shapes.impl2;

/**
 * @author Jon Mrowczynski
 */
public abstract class Shape {
    private String name;
    protected double area;
    protected double perimeter;

    public double getArea() { return area; }
    public double getPerimeter() { return perimeter; }

    protected Shape(String name) { this.name = name; }

    public String getName() { return name; }
    public void setName(String newName) { name = newName; }
}