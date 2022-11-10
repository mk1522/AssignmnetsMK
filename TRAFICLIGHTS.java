package basic;

import java.util.Scanner;

public class TRAFICLIGHTS {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("select your colours");
		String s=sc.next();
		switch(s) {
		
		case("red"):System.out.print("stop");
		             break;
		case("yello"):System.out.println("be ready");
		break;
		case("green"):System.out.println("GOO");
		break;
		default:System.out.println("wrong option");

	}


}
}
