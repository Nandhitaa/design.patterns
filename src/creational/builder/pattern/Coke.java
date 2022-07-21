package creational.builder.pattern;

public class Coke extends CoolDrink {

	Coke() {
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
		this.name = "Coke";
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public void setPrice() {
		this.price = 10.0f;
	}
}
