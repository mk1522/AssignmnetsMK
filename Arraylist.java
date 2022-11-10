package basic;

import java.util.ArrayList;

public class Arraylist extends VectorWithObjectsDemo {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		ArrayList list= new ArrayList(); 
		list.add("22");
		list.add(" fdgzdfg");
		list.add("345");
		list.add(null);
		list.add(null);
		list.add("22");
		list.add(45);
		System.out.println(list);
		System.out.println(list.get(5));
		System.out.println(list.remove(5));
		list.trimToSize();
		System.out.println(list);
		
		
		
		
		
	}

}
