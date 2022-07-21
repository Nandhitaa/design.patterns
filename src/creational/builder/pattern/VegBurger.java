package creational.builder.pattern;

public class VegBurger extends Burger {

	VegBurger() {
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
		this.name = "Veg Burger";
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public void setPrice() {
		this.price = 20.0f;
	}

}
