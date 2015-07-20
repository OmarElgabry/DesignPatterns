package decorator;

public class Main {

	public static void main(String[] args) {
		
		// Order hot chocolate 
		MenuItem beverage = new HotChocolate();
		
		// add mocha flavor to it
		beverage = new Mocha(beverage);
		
		// get invoice
		System.out.println("Your Order: " + beverage.description());
		System.out.println("Total Cost: " + beverage.cost());
		
	}

}
