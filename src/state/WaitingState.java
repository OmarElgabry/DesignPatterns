package state;

public class WaitingState implements State{

	private Microwave microwave;
	
	public WaitingState(Microwave _microwave){
		microwave = _microwave;
	}
	
	@Override
	public void start() {
		System.out.println("Microwave is working, Please wait ..... ");
		microwave.setCurState(microwave.getWorkingState());
	}

	@Override
	public void pause() {
		System.out.println("The Microwave is not working already");
	}

	@Override
	public void stop() {
		System.out.println("The Microwave is not working already");		
	}

}
