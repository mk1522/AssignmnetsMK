package basic;

import java.util.Scanner;

public class stringg {
	

	public static void main (String[] args) {
		
		
		Scanner sc = new Scanner( System.in);
		String s=sc.nextLine();
		System.out.println(s);
		if(s.endsWith(".jpg"))
			{
			    System.out.println("valid");
			}
		
		else
			System.out.println("not valid ");;
	}

}
