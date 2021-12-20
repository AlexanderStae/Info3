package Lab7;

public class Tea extends HotDrinkDecorator {

	public Tea(HotDrink newHotDrink) {
		super (newHotDrink);
	}
	
	public String getDescription() {
		return Hot.getDescription() + "Tea ";
	}
	 
	public double getCost() {
		return Hot.getCost() + 0.5;
	}
}
