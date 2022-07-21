package creational.builder.pattern;

public class Pepsi extends CoolDrink {

	Pepsi() {
		super();
		setName();
		setPrice();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName() {
		this.name = "Pepsi";
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public void setPrice() {
		this.price = 15.0f;
	}
}
