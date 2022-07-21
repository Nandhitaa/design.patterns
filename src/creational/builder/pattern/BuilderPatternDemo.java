package creational.builder.pattern;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.vegMeal();
		vegMeal.showItems();

		Meal nonVegMeal = mealBuilder.nonVegMeal();
		nonVegMeal.showItems();
	}

}
