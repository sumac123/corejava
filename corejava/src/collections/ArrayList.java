package collections;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		List li = new java.util.ArrayList();
		li.add(121);
		li.add("pooja");
		li.add("pooja");
		li.add(132);
		li.add(132);
		System.out.println(li.stream().distinct().collect(Collectors.toList()));
		System.out.println("occaorance of element java 7 " + Collections.frequency(li, 121));
		System.out.println("occaorance of element java 8"
				+ li.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())));

	}
}
