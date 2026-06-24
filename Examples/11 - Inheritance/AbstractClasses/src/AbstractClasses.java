import shapes.impl1.Circle;
import shapes.impl1.Rectangle;
import shapes.impl1.Shape;
import shapes.impl1.Square;

//	final Shape shape = new Shape("My Shape"); // This would cause a compilation issue.

final Circle circle = new Circle("MyCircle", 10);

final Rectangle rectangle = new Rectangle("MyRectangle", 3, 4);

final Square square = new Square("MySquare", 5);

/**
 * @author Jon Mrowczynski
 */
void main() {
	var shapes = new LinkedList<Shape>();
	shapes.add(circle);
	shapes.add(rectangle);
	shapes.add(square);
	printShapes(shapes);
	
	var rectangles = new LinkedList<Rectangle>();
	//		rectangles.add(circle); // This would cause a compilation issue.
	rectangles.add(rectangle);
	rectangles.add(square);
	printShapes(rectangles);
}

// Can use generics to do some crazy stuff with datatypes! More on this later...
void printShapes(LinkedList<? extends Shape> shapes) {
	IO.println("Printing Shapes: ");
	shapes.stream().map(shape -> """
			Name: %s
			Area: %.3f
			Perimeter: %.3f
			""".formatted(shape.getName(), shape.getArea(), shape.getPerimeter())).forEach(IO::println);
}
