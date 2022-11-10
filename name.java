package basic;

import java.util.Scanner;

public class name {
	public static void main (String[] args) {
		Scanner sc = new Scanner( System.in);
		String s=sc.nextLine();
		System.out.println(s);
		s.trim();
		String r =s.toUpperCase();
		String[] names= r.split(" ");
		int n=names.length;
		for(int i=0;i<n;i++) {
			if(i==0)
			System.out.print(names[i].charAt(0));
			else 
				System.out.print(" ."+names[i]);
			
			
		}
		//char[] ds
		//System.out.println(s.getChars(0, 5, , ));
		
	}
	

}
