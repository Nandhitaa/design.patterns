package creational.abstractfactory.pattern;

public class HomeLoan extends Loan {

	HomeLoan() {
		setInterestRate();
	}

	@Override
	void setInterestRate() {
		super.rate = 8;
	}
}
