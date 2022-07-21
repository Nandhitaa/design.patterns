package creational.abstractfactory.pattern;

public class SBI implements Bank {

	private final String bankName = "SBI";

	@Override
	public String getBankName() {
		return bankName;
	}

}
