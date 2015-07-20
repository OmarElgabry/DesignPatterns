package factory.abstr;

public class Main {

	public static void main(String[] args) {
		
		AnimalFactory factory = new BirdsFactory();
		
		Animal owl = factory.create("Owl");
		owl.display();

		factory = new MammalsFactory();
		
		Animal fox = factory.create("Fox");
		fox.display();

	}

}
