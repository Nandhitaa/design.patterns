package creational.abstractfactory.pattern;

public class FactoryCreator {

	public static AbstractFactory getFactory(String name) {

		if (name.equalsIgnoreCase("BANK")) {
			return new BankFactory();
		}
		else if (name.equalsIgnoreCase("LOAN")) {
			return new LoanFactory();
		}

		return null;

	}

}
