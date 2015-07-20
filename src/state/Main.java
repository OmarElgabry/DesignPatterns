package state;

public class Main {

	public static void main(String[] args) {
		
		Microwave microwave = new Microwave();

		microwave.start();
		microwave.pause();
		microwave.stop();
		
		microwave.stop();
		
		microwave.start();
		microwave.pause();
		microwave.start();
		microwave.stop();
	}

}
