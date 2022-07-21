package creational.prototype.pattern;

public abstract class Shape implements Cloneable {

	public abstract void draw();

	public Object clone() throws CloneNotSupportedException {
		Object clone = super.clone();
		return clone;
	}

}
