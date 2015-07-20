package observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer{

	private String name;
	
	public Subscriber(String _name, Observable observable){
		name = _name;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable observable, Object arg) {
		if(observable instanceof Newsletter){
			System.out.println("Subscriber " + name + " was notified " + observable);			
		}
	}

	
}
