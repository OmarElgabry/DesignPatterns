package singleton.eager;

public class Main {

	public static void main(String[] args) {
		
		// Implementation for singleton by instantiating object eagerly.
		// It's thread safe
		// It uses eager instantiation; instantiate object as soon as the class is loaded by the JVM
		// Pitfalls are:
			// What if the object won’t be always needed?, 
			// What if the object is very heavy and complex, hence it will slow down the system?
		Database database = Database.getInstance();
		database.display();

	}

}
