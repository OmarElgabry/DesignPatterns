package composite;

public class Main {

	public static void main(String[] args) {
		
		// start drawing zoo picture
		Picture zoo = new Picture("Zoo");
		
		// add shapes(circle, rectangle, line, picture) to picture
		zoo.add(new Circle());
		zoo.add(new Rectangle());
		zoo.add(new Line());

		Picture lion = new Picture("Lion");

		lion.add(new Circle());
		lion.add(new Rectangle());
		
		zoo.add(lion);

		// draw zoo picture
		zoo.draw();
	}

}
