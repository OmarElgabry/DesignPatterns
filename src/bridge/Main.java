package bridge;

public class Main {

	public static void main(String[] args) {
		
		// decouple Rectangle & Circle classes from Color Implementation,
		// As long as they can vary independently during the run time.
		AbstractShape shape = new Rectangle(new Blue());
		shape.applyColor();
		
		shape = new Circle(new Red());
		shape.applyColor();
	}

}
