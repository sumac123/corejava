package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
		System.out.println("7 " + Collections.frequency(li, 1));
		System.out.println(" 8" + li.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())));
		List l2 = new java.util.ArrayList();

		for (Object i : li) {

			if ((Integer) i % 2 == 0) {
				l2.add(i);
			}
		}
		System.out.println(l2);

		li.stream().distinct().filter(n -> (Integer) n % 2 == 1).forEach(System.out::println);
		
		List<Integer> l3 = (List<Integer>) li.stream().map(n -> (Integer) n * 5).collect(Collectors.toList());
		System.out.println(l3);
		
		li.stream().distinct().forEach(System.out::println);
		List<Integer> q = l3.stream().map(Integer::valueOf).collect(Collectors.toList());
		System.out.println(q);
		Set l7 = (Set) li.stream().filter(n -> li.stream().filter(x -> x.equals(n)).count() > 1)
				.collect(Collectors.toSet());
		l3.stream().limit(3).forEach(System.out::println);
		System.out.println("l7" + l7);
		int sum = IntStream.range(1, 500).reduce(0, Integer::sum);
		System.out.println("find max and min");
		List<Integer> lm = new java.util.ArrayList();
		lm.add(1);
		lm.add(1);
		lm.add(3);

		Integer i = lm.stream().max(Comparator.comparing(Integer::valueOf)).get();

		System.out.println("mi::" + i);
		Map<Integer, Integer> s = new HashMap<>();
		System.out.println("df" + s.put(1, 2));
		System.out.println("df" + s.put(2, 4));
		String sa = "ppooja";
		StringBuilder sb = new StringBuilder();
		sa.chars().distinct().forEach(a -> sb.append((char) a));


	}

}