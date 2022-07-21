package creational.abstractfactory.pattern;

public class ICICI implements Bank {

	private String bankName;

	ICICI() {
		bankName = "ICICI";
	}

	@Override
	public String getBankName() {
		return bankName;
	}

}
