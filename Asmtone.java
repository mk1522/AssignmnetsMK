package basic;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class Asmtone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you String");
		String s = sc.next();
		String[] ss=s.split("");
		Set hs = new HashSet<>();
	
		int n=ss.length;
		for(int i=0;i<n;i++) {
			hs.add(ss[i]);
			
		}
		System.out.println("Number of unique charecters in "+s+" are: "+hs.size());
	
		  
	}

}
