package singleton.classic;

public class Database {

	private static Database database = null;
	
	private Database(){}
	
	public static Database getInstance(){
		if(database == null){
			database = new Database();
		}
		return database;
	}
	
	public void display(){
		System.out.println("I'm the Classic Singleton");
		System.out.println("Be Caution: I'm NOT thread safe");
	}
}
