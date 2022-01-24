package lab7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HotDrink hotDrink1 = new Tea(new BasicHotDrink());
		HotDrink hotDrink2 = new Coffee(new BasicHotDrink());
		HotDrink hotDrink3 = new Sugar(new Coffee(new BasicHotDrink()));
		HotDrink hotDrink4 = new Cream(new Coffee(new BasicHotDrink()));
		HotDrink hotDrink5 = new Sugar(new Cream(new Cream(new Coffee(new BasicHotDrink()))));
		HotDrink hotDrink6 = new BlackTea(new BasicHotDrink());
		HotDrink hotDrink7 = new GreenTea(new BasicHotDrink());
		HotDrink hotDrink8 = new Sugar(new GreenTea(new BasicHotDrink()));
		HotDrink hotDrink9 = new Cream(new BlackTea(new BasicHotDrink()));
		
		System.out.println("Price = " + hotDrink1.getCost());
		System.out.println("Price = " + hotDrink2.getCost());
		System.out.println("Price = " + hotDrink3.getCost());
		System.out.println("Price = " + hotDrink4.getCost());
		System.out.println("Price = " + hotDrink5.getCost());
		System.out.println("Price = " + hotDrink6.getCost());
		System.out.println("Price = " + hotDrink7.getCost());
		System.out.println("Price = " + hotDrink8.getCost());
		System.out.println("Price = " + hotDrink9.getCost());
	}

}

