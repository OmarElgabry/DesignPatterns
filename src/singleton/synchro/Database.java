package singleton.synchro;

public class Database {

	private static Database database = null;
	
	private Database(){}
	
	public static synchronized Database getInstance(){
		if(database == null){
			database = new Database();
		}
		return database;
	}
	
	public void display(){
		System.out.println("I'm the Synchronized Singleton");
	}
}
