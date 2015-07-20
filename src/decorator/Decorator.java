package decorator;

public class Decorator implements MenuItem{

	protected MenuItem beverage;
	
	public Decorator(MenuItem _beverage){
		beverage = _beverage;
	}
	
	@Override
	public double cost() {
		return beverage.cost();
	}

	@Override
	public String description() {
		return beverage.description();
	}

}
