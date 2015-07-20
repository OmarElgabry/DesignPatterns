package state;

public class WorkingState implements State{

	private Microwave microwave;
	
	public WorkingState(Microwave _microwave){
		microwave = _microwave;
	}
	
	@Override
	public void start() {
		System.out.println("Microwave is working already");
	}

	@Override
	public void pause() {
		System.out.println("Microwave is paused.");
		microwave.setCurState(microwave.getPausedState());
	}

	@Override
	public void stop() {
		System.out.println("Microwave is stopped.");
		microwave.setCurState(microwave.getWaitingState());
	}

}
