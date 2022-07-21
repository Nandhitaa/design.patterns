package creational.builder.pattern;

public class ChickenBurger extends Burger {

	ChickenBurger() {
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
		this.name = "Chicken Burger";
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public void setPrice() {
		this.price = 50.0f;
	}

}
