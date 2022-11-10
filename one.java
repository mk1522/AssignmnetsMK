package basic;

import java.util.Scanner;

public class one {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c= sc.nextInt();
	System.out.println(a +" "+ "  " +b+"" +" "+ c);
	int r=(a<b)?b:a;
	int f=(r<c)?c:r;
	System.out.println(f);
	
	

}
}
