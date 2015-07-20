package bridge;

public abstract class AbstractShape {

	protected Color color;
	
	public AbstractShape(Color _color){
		color = _color;
	}
	
	public void setColor(Color _color){
		color = _color;
	}
	
	public abstract void applyColor();
}
