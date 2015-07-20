package iterator.separate;

import java.util.Iterator;

public class MyList implements Iterable<String>{

	private static final int MAX_SIZE = 6;
	private int length = 0;
	private String list[];

	public MyList(){
		list = new String[MAX_SIZE];
	}
	
	public void addItem(String str){
		if(length >= MAX_SIZE){
			System.out.println("The list is full, You can't add anymore");
		}else{
			list[length++] = str;
		}
	}
	
	@Override
	public Iterator<String> iterator() {
		return new ListIterator(list, length);
	}
}
