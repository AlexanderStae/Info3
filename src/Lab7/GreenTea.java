package Lab7;

public class GreenTea extends Tea{

	public GreenTea(HotDrink newHotDrink) {
		super (newHotDrink);
	}
	
	public String getDescription() {
		return Hot.getDescription() + "Green Tea ";
	}
	 
	public double getCost() {
		return Hot.getCost() + 0.4;
	}
}
