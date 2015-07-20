package iterator.single;

import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		
		// create list object(list of strings)
		MyList list = new MyList();
		
		// add strings 
		list.addItem("Prague");
		list.addItem("California");
		list.addItem("Amsterdam");
		
		// get iterator object 
		Iterator<String> it = list.iterator();
		
		// iterate through list items
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}

}
