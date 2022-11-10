package basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class arraylistt {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Krisjdhsa");
		al.add("sjdhsa");
		al.add("sa");
		al.add("hh");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		/*int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		     al.add(sc.next());
		
		}*/
		
		//System.out.println(al);
		ArrayList<LOMBOK> al1= new ArrayList<>();
		al1.add(new LOMBOK(11,"krishna",25,"tpt"));
     	al1.add(new LOMBOK(12,"soumya",20,"oikjhvcdfghj"));
	    al1.add(new LOMBOK(13,"sai",27,"oiuhgfdghj"));
		/*for(int i=0;i<3;i++) {
		System.out.println("Enter the details of Employee:");
		LOMBOK lk =new LOMBOK(sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
		al1.add(lk);
		}*/
		System.out.println(al1);
		
		al1.add(1, new LOMBOK(4,"sai",21,"oiuyt"));
          Set<LOMBOK> sl=new HashSet();
          sl.addAll(al1);
          Collections.sort(al1,new LOMBOK());
          Iterator<LOMBOK> itr =al1.iterator();
          while(itr.hasNext()) {
        	  System.out.print(itr;
          }
          Collections.sort(al1,new  namecom());.
         
          
          
		
		System.out.println("------ is:"+al1);

	}

}
