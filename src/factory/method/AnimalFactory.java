package factory.method;

public class AnimalFactory {

	public Animal create(String animal){
		
		animal = animal.toUpperCase();

		if(animal.equals("CAT")){
			return new Cat();
		}else if(animal.equals("DOG")){
			return new Dog();
		}
		return null;
	}
}
