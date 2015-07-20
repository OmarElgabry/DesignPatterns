package strategy;

public class PayPal implements Payment{

	private String email;
	//private String password;
	
	public PayPal(String email, String password){
		this.email    = email;
		//this.password = password;
	}
	
	@Override
	public void make(int amount) {
		System.out.println("You have successfully paid " + amount + " with paypal");
		System.out.println("Paypal Email: " + email);
	}

}
