package basic;

import java.util.Scanner;

public class Arraytomap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(s);
		String[]ss = s.split("");
		System.out.println(ss[1]);
		int n=ss.length;
		
		for(int i=0;i<n;i++) {
			int r=0;
			for(int j=1;j<n;j++) {
				if(ss[i]==ss[j]) {
					r++;
					
				}
				
			}
			System.out.println(ss[i]+" "+r);
			
		}

	}

}
