package state;

public class Microwave {

	private State WaitingState;
	private State WorkingState;
	private State PausedState;

	private State curState;
	
	public Microwave(){
		WaitingState = new WaitingState(this);
		WorkingState = new WorkingState(this);
		PausedState  = new PausedState(this);
		
		curState  = WaitingState;
	}
	
	public void start(){
		curState.start();
	}
	
	public void pause(){
		curState.pause();
	}
	
	public void stop(){
		curState.stop();
	}
	
	public void setCurState(State state){
		curState = state;
	}
	
	public State getWaitingState() {
		return WaitingState;
	}

	public State getWorkingState() {
		return WorkingState;
	}

	public State getPausedState() {
		return PausedState;
	}
	
}
