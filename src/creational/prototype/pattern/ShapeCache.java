package creational.prototype.pattern;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<Integer, Shape> cache = new Hashtable<Integer, Shape>();

	public static void loadCache() {
		cache.put(1, new Circle());
		cache.put(2, new Rectangle());
		cache.put(3, new Square());
	}

	public static Shape getShape(int key) throws CloneNotSupportedException {
		Shape shape = cache.get(key);
		return (Shape) shape.clone();
	}

}
