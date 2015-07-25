package prototype.inter;

public class Book implements Product{

	@Override
	public Book clone() {
		try {
			return (Book) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
	
	@Override
	public String toString() {
		return "Book";
	}

}
