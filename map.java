package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map {
	public static void main(String[] args) {
		Map<Integer,String >m = new HashMap<>();
		m.put(1, "krishna");
		m.put(2, "kri");
		m.put(3, "kris");
		m.put(4, "Rishna");
		System.out.println(m.keySet());
		System.out.println(m.get(2));
		
		//Iterator itr = m.entrySet().iterator();
		Set<Integer> itr=m.keySet();
		Iterator itrr =itr.iterator();
		
				//keySet().iterator();
		while(itrr.hasNext()) {
			
			int k=(int) itrr.next();
 			System.out.println( k+" "+m.get(k));
		
		
		
		
		
	}

}
}
