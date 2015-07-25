package prototype.inter;

public class Movie implements Product{

	@Override
	public Movie clone() {
		try {
			return (Movie) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	@Override
	public String toString() {
		return "Movie";
	}

}
