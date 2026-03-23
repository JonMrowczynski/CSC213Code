package shapes.impl1;

/**
 * @author Jon Mrowczynski
 */
public abstract class Shape {
    private String name;

    public abstract double getArea();
    public abstract double getPerimeter();

    protected Shape(String name) { this.name = name; }

    public String getName() { return name; }
    public void setName(String newName) { name = newName; }
    
}