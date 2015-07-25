package prototype.inter;

public class Album implements Product{

	@Override
	public Album clone() {
		try {
			return (Album) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	@Override
	public String toString() {
		return "Album";
	}

}
