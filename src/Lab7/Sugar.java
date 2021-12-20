package Lab7;

public class Sugar extends HotDrinkDecorator {

	public Sugar(HotDrink newHotDrink) {
		super (newHotDrink);
	}
	
	public String getDescription() {
		return Hot.getDescription() + "with Sugar";
	}
	 
	public double getCost() {
		return Hot.getCost() + 0.05;
	}
}
