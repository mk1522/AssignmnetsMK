package basic;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		
		Stack s = new Stack<>();
		s.add(345324);
		s.add(234);
		s.add(345324);
		s.add("krishna");
		System.out.println("1"+s);
		s.pop();
		System.out.println("2"+s);
		s.toArray();
		System.out.println("3"+s);
		s.peek();
		System.out.println(s.peek());
	}

}
