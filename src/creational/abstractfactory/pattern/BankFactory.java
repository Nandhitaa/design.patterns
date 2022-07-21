package creational.abstractfactory.pattern;

public class BankFactory extends AbstractFactory {

	@Override
	Bank getBank(String name) {
		if (name.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		}
		if (name.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		if (name.equalsIgnoreCase("CITI")) {
			return new CITI();
		}
		return null;
	}

	@Override
	Loan getLoan(String name) {
		return null;
	}

}
