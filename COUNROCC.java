package basic;

import java.util.Scanner;

public class COUNROCC {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		System.out.println("enter your string");
		String f=sc.next();
		String[] names= s.split(" ");
		int n = names.length;
		int k=0;
		for(int i=0;i<n;i++) {
			
			if(names[i].equalsIgnoreCase(f)) {
				k++;
			}
		}
		if(k>0) 
			System.out.println("occurence of "+f+ " is:" +k);
		else
			System.out.println("NO OCCURENCE ");
		
	}
}
