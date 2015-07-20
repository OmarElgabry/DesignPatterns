package singleton.synchro;

public class Main {

	public static void main(String[] args) {
		
		// This implementation relies on the keyword "synchronized",
		// in getInstance() method, So, that it's thread safe.
		// Pitfalls of this method is Synchronization is expensive, 
		// you will pay performance(takes more time) cost every time you call getInstance() method. 
		Database database = Database.getInstance();
		database.display();
		
	}

}
