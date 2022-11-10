package basic;

import java.util.Scanner;

public class names {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner( System.in);
		String s=sc.nextLine();
		System.out.println(s);
		s.trim();
		int m=s.indexOf(" ");
		String r =s.toUpperCase();
		String[] names= r.split(" ");
		int n= names.length;
		if(n>2)
		System.out.println(r.charAt(0)+"."+r.charAt(m+1)+"."+names[n-1]);
		else 
			System.out.println(r.charAt(0)+"."+names[1]);

}
}
