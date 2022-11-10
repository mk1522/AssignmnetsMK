package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class data{
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("krishna");
		al.add("krishna");
		al.add("krishna");
		al.forEach(emp->System.out.println(emp));
		ArrayList<LOMBOK> al1 = new ArrayList<>();
		al1.add(new LOMBOK(22,"krishna"));
		al1.add(new LOMBOK(22,"krishna"));
		al1.add(new LOMBOK(22,"krishna"));
		al1.add(new LOMBOK(22,"krishna"));
		al1.forEach(emp->System.out.println(emp));
		al1.forEach(emp->System.out.println(emp.getName()));
		al1.forEach(emp->System.out.println(emp.getId()));
		HashSet<String> hs = new HashSet<>();
		hs.add("java");
		hs.add("jahhva");
		hs.add("javkkka");
		hs.forEach(emp->System.out.println(emp));
		HashMap<Integer,String> hm = new HashMap<>();
		//hm.put(new LOMBOK(22,"yooo"));
		hm.put(22, "kdjfgnlsdf");
		//hm.forEach(emp->System.out.println(emp));
		
		
	}
}
