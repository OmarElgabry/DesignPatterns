package strategy;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new SilverCustomer();
		
		// display customer account type
		customer.display();
		
		// set payment method with paypal and make a purchase
		customer.setPayment(new PayPal("example@paypal.com", "2xA&5d7^B"));
		customer.purchase(5000);
		
		// set payment method with credit card and make a purchase
		customer.setPayment(new CreditCard("John", 584689201));
		customer.purchase(2500);
	}

}
