package basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class asfour {

	public static void main(String[] args) {
		Set hs = new HashSet<>();
		hs.add("hi");
		hs.add("hello");
		hs.add("how are");
		hs.add("you");
		System.out.println("this is set "+hs);
		List al = new ArrayList<>(hs);
		System.out.println("this is aaray list "+al);
		

	}

}
