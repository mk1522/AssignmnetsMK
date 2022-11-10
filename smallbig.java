package basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class smallbig {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(sc.hasNextInt()) {
			al.add(sc.nextInt());
			
		}
		Collections.sort(al);
		int n=al.size();
		System.out.println(al);
		System.out.println("largest number "+al.get(5));
		System.out.println("smallest "+al.get(0));
		
		
	}

}
