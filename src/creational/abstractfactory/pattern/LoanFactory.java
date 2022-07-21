package creational.abstractfactory.pattern;

public class LoanFactory extends AbstractFactory {

	@Override
	Bank getBank(String name) {
		return null;
	}

	@Override
	Loan getLoan(String name) {
		if (name.equalsIgnoreCase("Home")) {
			return new HomeLoan();
		}
		if (name.equalsIgnoreCase("Education")) {
			return new EducationLoan();
		}
		return null;
	}

}
