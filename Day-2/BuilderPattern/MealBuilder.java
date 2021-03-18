package BuilderPattern;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal nonvegmeal = new Meal();
		nonvegmeal.addItem(new ChickenBurger());
		nonvegmeal.addItem(new Pepsi());
		return nonvegmeal;
	}

}
