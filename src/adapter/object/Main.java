package adapter.object;

public class Main {

	public static void main(String[] args) {
		
		// create animal instance & call run() method.
		Animal animal = new Dog();
		animal.run();
		
		// although Kangaroo can't run(i.e. jumps), 
		// we used the KangarooAdapter to adapt Kangaroo object,
		// so that, we can use run() method as well.
		animal = new KangarooAdapter();
		animal.run();

	}

}
