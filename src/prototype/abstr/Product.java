package prototype.abstr;

public abstract class Product implements Cloneable{
	
	@Override
	public Product clone() {
		try {
			return (Product) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
