package strategy;

public abstract class Customer {
	
	private Payment payment;
	
	public Customer(){
	}
	
	public void setPayment(Payment _payment){
		payment = _payment;
	}
	
	public void purchase(int amount){
		payment.make(amount);
	}
	
	public abstract void display();
}
