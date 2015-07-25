package prototype.inter;

public class ProductFactory {

	private Book book;
	private Album album;
	private Movie movie;
	
	public ProductFactory(Album _album, Book _book, Movie _movie){
		album = _album;
		book = _book;
		movie = _movie;
	}
	
	public Book getBook() {
		return book.clone();
	}

	public Album getAlbum() {
		return album.clone();
	}

	public Movie getMovie() {
		return movie.clone();
	}	
	
}
