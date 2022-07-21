package creational.abstractfactory.pattern;

public class Demo {

	public static void main(String[] args) {

		String bankName = "SBI";
		String loanType = "HOME";
		double amt = 20000;
		int yrs = 3;

		AbstractFactory bankFactory = FactoryCreator.getFactory("BANK");
		String bank = bankFactory.getBank(bankName).getBankName();
		System.out.println("Bank Name is: " + bank);

		FactoryCreator.getFactory("LOAN").getLoan(loanType).calculate(amt, yrs);
	}

}
