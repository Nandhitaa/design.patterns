package creational.factory.pattern;

public class ShapeFactory {

	public Shape getShape(SHAPES shape) {
		if (shape.equals(SHAPES.CIRCLE)) {
			return new Circle();
		}
		else if (shape.equals(SHAPES.RECTANGLE)) {
			return new Rectangle();
		}
		else if (shape.equals(SHAPES.SQUARE)) {
			return new Square();
		}
		return null;
	}

}
