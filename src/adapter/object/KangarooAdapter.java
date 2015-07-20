package adapter.object;

public class KangarooAdapter implements Animal{

	private final Kangaroo kangaroo;
	
	public KangarooAdapter(){
		kangaroo = new Kangaroo();
	}
	
	@Override
	public void run() {
		kangaroo.jump();
	}
}
