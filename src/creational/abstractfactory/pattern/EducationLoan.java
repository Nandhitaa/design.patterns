package creational.abstractfactory.pattern;

public class EducationLoan extends Loan {

	EducationLoan() {
		setInterestRate();
	}

	@Override
	void setInterestRate() {
		super.rate = 10;
	}
}
