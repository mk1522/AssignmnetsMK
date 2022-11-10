package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamm {

	public static void main(String[] args) {
		List<Integer> list =  Arrays.asList(3213,123,1223,343,223,2222);
		list.stream().sorted().forEach(System.out::println);
		//Stream<LOMBOK> empStream = Stream.of(new LOMBOK(1, "Shiva"),
			//	new LOMBOK(9, "Shiva"),new LOMBOK(2, "ahiva"),new LOMBOK(8, "bhiva"));
		
		
		
		//empStream.min((i,j)->i.getName().compareTo(j.getName())).toString();
		//Stream<LOMBOK> p =empStream.filter(s->s.getName().startsWith("s"));
	String sss=empStream.sorted((e1,e2)->e1.getName().compareToIgnoreCase(e2.getName())).filter(e1->e1.getId()>5).
	filter((s)->s.getName().startsWith("b")).toString();
	//forEach(System.out::println);
		System.out.println(sss+"**********");
		//System.out.println(p);
		
		// list.stream().filter(n->n<5000).forEach(System.out::println);
		//String s= list.stream().min((i,j)->i.compareTo(j)).toString();
		String l= list.stream().max((i,j)->i.compareTo(j)).toString();
		
		System.out.println(l);
		
		Stream<Integer> ss= Stream.generate(()->1*1).limit(15);
		ss.forEach(System.out::println);
		Stream.iterate(1,k->k+2).limit(10).forEach(num->System.out.println(num));
		int[] arr = new int[] {4,2,7,3,9};
IntSummaryStatistics stats = IntStream.of(arr).summaryStatistics();
		
		
System.out.println("Min : " + IntStream.of(arr).min().getAsInt());
System.out.println("Max : " + IntStream.of(arr).max().getAsInt());

IntStream.of(arr).sorted().forEach(num -> System.out.print(num + " "));
System.out.println();
IntStream.of(arr).sorted().limit(4). forEach(num -> System.out.print(num + " "));
System.out.println();
System.out.println("Sum : " + IntStream.of(arr).sum());
System.out.println(IntStream.of(arr).min().getAsInt());
		System.out.println(stats.getAverage());
		System.out.println(stats.getCount());
		System.out.println(stats.getMax());
		System.out.println(stats.getMin());
		System.out.println(stats.getSum());
		
		//empStream.filter(emp ->sorted((emp1,emp2) -> emp1.getEname()
				//.compareTo(emp2.getEname())). forEach(System.out::println));
	}

}
