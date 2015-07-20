package bridge;

public class Rectangle extends AbstractShape{

	public Rectangle(Color _op) {
		super(_op);
	}

	@Override
	public void applyColor() {
		System.out.print("Rectangle is now colored with ");
		this.color.apply();
	}

}
