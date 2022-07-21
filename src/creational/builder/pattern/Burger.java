package creational.builder.pattern;

public abstract class Burger extends Item {

	Burger() {
		setPacking();
	}

	@Override
	public String getPacking() {
		return packing;
	}

	@Override
	public void setPacking() {
		this.packing = "WRAPPER";
	}

}
