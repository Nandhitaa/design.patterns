package creational.builder.pattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	private float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.getPrice();
		}
		return cost;
	}

	public void showItems() {
		System.out.println("Your meal contains:");
		for (Item item : items) {
			System.out.println(item.getName() + " wrapped in " + item.getPacking() + " of price " + item.getPrice());
		}
		System.out.println("Total Cost: " + getCost());
	}
}
