package prototype.abstr;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

	private static Map<String, Product> products = new HashMap<String, Product>();

	public static Product getProduct(String product) {
		Product cachedProduct = products.get(product);
		return (Product) cachedProduct.clone();
	}
	
	public static void loadCache() {
		
		Book book 	= new Book();
		Album album = new Album();
		Movie movie = new Movie();
		
		products.put(book.toString(), book);
		products.put(album.toString(), album);
		products.put(movie.toString(), movie);
	}
}
