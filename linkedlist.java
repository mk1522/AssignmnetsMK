package basic;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		LinkedList ll = new LinkedList();
		ll.add(3434);
		ll.add(4512);
		ll.add("yoo");
		ll.add("krishna");
		System.out.println(ll);
		ll.peek();
		System.out.println(ll);
        ll.peekFirst();
        System.out.println(ll);
        ll.poll();
        System.out.println(ll);
        ll.pollFirst();
        System.out.println(ll);
        ll.push(345);
        ll.pop();
        System.out.println(ll);
        
        
	}

}
