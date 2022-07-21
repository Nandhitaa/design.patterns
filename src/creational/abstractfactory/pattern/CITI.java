package creational.abstractfactory.pattern;

public class CITI implements Bank {

	private final String bankName = "CITI";

	@Override
	public String getBankName() {
		return bankName;
	}

}
