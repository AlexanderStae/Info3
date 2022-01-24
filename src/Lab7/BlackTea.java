package lab7;

public class BlackTea extends Tea {

	public BlackTea(HotDrink newHotDrink) {
		super (newHotDrink);
	}
	
	public String getDescription() {
		return Hot.getDescription() + "Black Tea ";
	}
	 
	public double getCost() {
		return Hot.getCost() + 1.0;
	}
}


