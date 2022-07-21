package creational.builder.pattern;

public abstract class CoolDrink extends Item {

	CoolDrink() {
		setPacking();
	}

	@Override
	public String getPacking() {
		return packing;
	}

	@Override
	public void setPacking() {
		this.packing = "BOTTLE";
	}

}
