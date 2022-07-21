package creational.builder.pattern;

public abstract class Item {

	protected String name;
	protected float price;
	protected String packing;

	public abstract String getName();

	public abstract void setName();

	public abstract float getPrice();

	public abstract void setPrice();

	public abstract String getPacking();

	public abstract void setPacking();
}
