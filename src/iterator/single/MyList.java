package iterator.single;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
		return new ListIterator(list);
	}
	
	private class ListIterator implements Iterator<String> {

		private String list[];
		private int size = 0;
		private int curIndex = 0;
		
		public ListIterator(String[] list) {
			this.list = list;
			this.size = length;
		}
		
		@Override
		public boolean hasNext() {
			return size > curIndex;
		}

		@Override
		public String next() {
			if (!hasNext()) {
				throw new NoSuchElementException();
			}
			return list[curIndex++];
		}
		
		public void remove(){
			throw new UnsupportedOperationException(); 
		}
	}
}
