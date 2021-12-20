package Lab7;

public class Coffee extends HotDrinkDecorator {

	public Coffee(HotDrink newHotDrink) {
		super (newHotDrink);
	}
	
	public String getDescription() {
		return Hot.getDescription() + "Coffee ";
	}
	 
	public double getCost() {
		return Hot.getCost() + 0.6;
	}
}
