package basic;

import java.util.function.BiPredicate;

public class bipredicatee {

	public static void main(String[] args) {
		
		BiPredicate<Integer, String> bp = (n,s)-> {
			if(n==Integer.parseInt(s)) 
				return true;
				else  return false;
				
		};
		
		System.out.println(bp.test(2, "2"));
		
		BiPredicate<Integer, String> bp1 = (n,s)-> {
			if(n>Integer.parseInt(s)) 
				return true;
				else  return false;
				
		};
		
		
	}

}
