import shapes.impl1.Circle;
import shapes.impl1.Rectangle;
import shapes.impl1.Shape;
import shapes.impl1.Square;

import java.util.LinkedList;

/**
 * @author Jon Mrowczynski
 */
public class AbstractClasses {
	
	//	private static final Shape shape = new Shape("My Shape"); // This would cause a compilation issue.
	
	private static final Circle circle = new Circle("MyCircle", 10);
	
	private static final Rectangle rectangle = new Rectangle("MyRectangle", 3, 4);
	
	private static final Square square = new Square("MySquare", 5);
	
	public static void main(String[] args) {
		var shapes = new LinkedList<Shape>();
		shapes.add(circle);
		shapes.add(rectangle);
		shapes.add(square);
		printShapes(shapes);
		
		var rectangles = new LinkedList<Rectangle>();
		//		rectangles.add(circle); // This would cause a compilation issue.
		rectangles.add(rectangle);
		rectangles.add(square);
//		printShapes(rectangles);
	}
	
	// Can use generics to do some crazy stuff with datatypes! More on this later...
	private static void printShapes(LinkedList<? extends Shape> shapes) {
		System.out.println("Printing Shapes: ");
		for (var shape : shapes) {
			final var str = """
					Name: %s
					Area: %.3f
					Perimeter: %.3f
					""".formatted(shape.getName(), shape.getArea(), shape.getPerimeter());
			System.out.println(str);
		}
	}
}
