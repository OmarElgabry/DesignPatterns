package observer;

import java.util.Observable;

public class Newsletter extends Observable{

	private String content;

	public Newsletter(){}
	
	public void notifyChanges(){
		setChanged();
		notifyObservers();
	}
	
	public void create(String _content){
		content = _content;
		notifyChanges();
	}
	
	public String getContent() {
		return content;
	}
}
