package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Atwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		String s =num.toString();
		String[] ss= s.split("");
		List hs = new ArrayList<>();
		
		int n=ss.length;
		int r=0;
		for(int i=0;i<n;i++) {
			r=r+Integer.parseInt(ss[i]);
			
		}
		System.out.println(r);
	}

}
