package strategy;

public class CreditCard implements Payment{

	private String name;
	private int cardNum;
	
	public CreditCard(String name, int cardNum){
		this.name    = name;
		this.cardNum = cardNum;
	}
	
	@Override
	public void make(int amount) {
		System.out.println("You have successfully paid " + amount + " with credit card");
		System.out.println("Card Number: " +  cardNum);
		System.out.println("Name: " +  name);
	}

}
