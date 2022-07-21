package creational.abstractfactory.pattern;

public abstract class Loan {

	protected double rate;

	abstract void setInterestRate();

	public void calculate(double amount, int years) {
		System.out.println("rate:" + rate);
		double SI = (amount * rate * years);
		System.out.println("SI = " + SI);
	}
}
