package Lab7;

public class Cream extends HotDrinkDecorator {

	public Cream(HotDrink newHotDrink) {
		super (newHotDrink);
	}
	
	public String getDescription() {
		return Hot.getDescription() + "with cream";
	}
	 
	public double getCost() {
		return Hot.getCost() + 0.1;
	}
}
