package lab7;

abstract class HotDrinkDecorator implements HotDrink {
	
	protected HotDrink Hot;
	
	public HotDrinkDecorator(HotDrink newHotDrink) {
		Hot = newHotDrink;
	}
	
    public String getDescription() {
    	return Hot.getDescription();
    }
	 
	public double getCost() {
		return Hot.getCost();
	}

}
