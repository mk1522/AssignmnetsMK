package basic;

import java.util.ArrayList;
import java.util.Collections;

public class secndsmall {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(5);
		al.add(2);
		al.add(6);
		al.add(1);
		al.add(9);
		Collections.sort(al);
		int n=al.size();
		int [] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i]=al.get(i);
			
		}
		System.out.println(a[1]);
		

	}

}
