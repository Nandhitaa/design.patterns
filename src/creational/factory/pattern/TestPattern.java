package creational.factory.pattern;

public class TestPattern {

	public static void main(String[] args) {

		ShapeFactory factory = new ShapeFactory();
		Shape shape = factory.getShape(SHAPES.CIRCLE);
		shape.draw();
		shape = factory.getShape(SHAPES.RECTANGLE);
		shape.draw();
		shape = factory.getShape(SHAPES.SQUARE);
		shape.draw();

	}

}
