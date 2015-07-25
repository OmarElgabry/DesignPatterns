package prototype.inter;

public class Main {

	public static void main(String[] args) {
		
		// ProductFactory has references
		// to initially created objects(album, book, movie)
		ProductFactory factory = new ProductFactory(new Album(), new Book(), new Movie());
		
		// clone existing objects
		Album album	 = factory.getAlbum();
		Book book	 = factory.getBook();
		Movie movie	 = factory.getMovie();
		
		System.out.println(album);
		System.out.println(book);
		System.out.println(movie);
		
	}

}
