package singleton.eager;

public class Database {

	private static Database database = new Database();
	
	private Database(){}
	
	public static Database getInstance(){
		return database;
	}
	
	public void display(){
		System.out.println("I'm the Static/Eager Singleton");
	}
}
