package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class asthree {

	public static void main(String[] args) {
		Set ts = new TreeSet<>();
		ts.add(22);
		ts.add(33);
		ts.add(2);
		ts.add(23);
		ts.add(15);
		
		System.out.print(ts);
		List al = new ArrayList<>(ts);
       Collections.reverse(al);
		System.out.print(al);
		
		

	}

}
