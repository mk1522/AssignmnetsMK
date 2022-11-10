package basic;

import java.util.Scanner;

public class ODDrevers {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		String[] names= s.split(" ");
		int n = names.length;
		
		for(int i=0;i<n;i++) {
			
			if(names[i].length()%2!=0) {
				
				System.out.println(names[i]);
				
			}
		}

	}

}
