package basic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class sortmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(2,"krishna");
		hm.put(6,"rishna");
		hm.put(4,"ishna");
		hm.put(33,"shna");
		System.out.println(hm);
		Map<Integer,String> mp = new TreeMap<>(hm);
		System.out.println(mp);
		
		ArrayList list= new ArrayList();
		
		
		 
		Iterator<Integer> itr =hm.keySet().iterator();
		while(itr.hasNext()) {
		list.add(itr.next());	
	}
		Collections.sort(list);
		
		
		int n=list.size();
		int[] a = new int[n];
		//System.out.println(s);
		
		for(int i=0;i<n;i++) {
			System.out.println(list.get(i)+" "+hm.get(list.get(i)));
		}
	}
	

}
