package basic;
import java.util.Scanner;
public class names2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		String s=sc.nextLine();
		String r =s.toUpperCase();
		String[] names= r.split(" ");
		int n=names.length;
		for(int i=0;i<n;i++) {
			if(i==(n-1))
				System.out.print("."+names[i]);
			else
				System.out.print(" "+names[i].charAt(0));
				}
		}
}
