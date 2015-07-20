package dependency;

public class Main {

	public static void main(String[] args) {
		
		// passing a dependency 
		//App myApp = new App(new Database());
		//myApp.dependency();
		
		// passing set of dependencies
		Service services[] = {new Database(), new Mail(), new Logger()};
		App myApp = new App(services);
		
		myApp.dependencies();
	}
}
