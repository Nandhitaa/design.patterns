package creational.prototype.pattern;

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		ShapeCache.loadCache();
		Shape circle = ShapeCache.getShape(1);
		circle.draw();
		Shape rectangle = ShapeCache.getShape(2);
		rectangle.draw();
		Shape square = ShapeCache.getShape(3);
		square.draw();

	}

}
