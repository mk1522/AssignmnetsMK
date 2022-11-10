package basic;

import java.util.Iterator;

import java.util.Vector;

public class VectorWithObjectsDemo {

	public static void main(String[] args) {
		Vector<Employee> olist = new Vector<Employee>();
		
		
		//olist.add(new Employee());
		olist.add(new Employee(1, "Rama", "Krishna", 34000));
		olist.add(new Employee(2, "Kiran", "Kumar", 32000));
		olist.add(null);
		olist.add(new Employee(3, "Mahesh", "Chandra", 35000));
		olist.add(new Employee(4, "Mukesh", "Rout", 33000));
		olist.add(new Employee(5, "Shiva", "Shankar", 34000));
		olist.add(4, new Employee(10, "Sachin", "Rana", 35000));
		Iterator<Employee>  itr = olist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
