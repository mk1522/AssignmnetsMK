package basic;

import java.util.Comparator;

public class namecom implements Comparator<LOMBOK> {

	@Override
	public int compare(LOMBOK o1, LOMBOK o2) {
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
