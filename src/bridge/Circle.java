package bridge;

public class Circle extends AbstractShape{

	public Circle(Color _op) {
		super(_op);
	}

	@Override
	public void applyColor() {
		System.out.print("Circle is now colored with ");
		this.color.apply();
	}
}