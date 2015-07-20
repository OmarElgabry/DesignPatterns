package state;

public class PausedState implements State{

	private Microwave microwave;
	
	public PausedState(Microwave _microwave){
		microwave = _microwave;
	}
	
	@Override
	public void start() {
		System.out.println("Microwave is resumed.");
		microwave.setCurState(microwave.getWorkingState());
	}

	@Override
	public void pause() {
		System.out.println("Microwave is already paused");
	}

	@Override
	public void stop() {
		System.out.println("Microwave is stopped.");
		microwave.setCurState(microwave.getWaitingState());
	}

}
