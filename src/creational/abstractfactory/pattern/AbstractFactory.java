package creational.abstractfactory.pattern;

public abstract class AbstractFactory {

	abstract Bank getBank(String name);

	abstract Loan getLoan(String name);

}
