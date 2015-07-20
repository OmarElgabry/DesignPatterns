package decorator;

public class Espresso implements MenuItem{
	
	@Override
	public double cost() {
		return 18.0;
	}

	@Override
	public String description() {
		return "Espresso roast";
	}
}
