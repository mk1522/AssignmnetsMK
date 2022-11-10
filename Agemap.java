package basic;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
public class Agemap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(2,"krishna");
		hm.put(6,"rishna");
		hm.put(4,"ishna");
		hm.put(33,"హాయ్");
		  
		System.out.println(hm);
		int n=hm.size();
		  Iterator<Integer> itr = hm.keySet().iterator();
		for(int i=0;i<n;i++)	
		{ 
			int k= itr.next();
			if(k>=18) {
				System.out.println(k +" "+hm.get(k));
				
			}			
		}
				
	}
	
}