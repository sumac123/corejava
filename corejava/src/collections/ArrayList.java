package collections;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayList {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List li = new java.util.ArrayList();
		li.add(1);
		li.add(1);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(5);
				System.out.println(li.stream().distinct().collect(Collectors.toList()));
		System.out.println("occaorance of element java 7 " + Collections.frequency(li, 121));
		System.out.println("occaorance of element java 8"
				+ li.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())));
List l2 =  new java.util.ArrayList();
		
for(Object i:li) {

	if((Integer)i%2==0) {
		l2.add(i);
	}
	}
System.out.println(l2);

List l=(List) li.stream().distinct().filter(n -> (Integer)n % 2 == 1).collect(Collectors.toList());
List<Integer> l3=(List<Integer>) li.stream().map(n->(Integer)n*5).collect(Collectors.toList());
System.out.println(l3);
li.stream().distinct().forEach(System.out::println);


Set l7=(Set) li.stream().filter(n -> li.stream().filter(x -> x.equals(n)).count() > 1).collect(Collectors.toSet());

System.out.println(l7);

	
	}
	
	
}