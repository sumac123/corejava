package collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class IteratingMap {
	public static void main(String[] args) {
		SortedMap<String, Integer> unsorted = new TreeMap<String, Integer>();
		unsorted.put("pooja", 7);
		unsorted.put("mahesh", 5);
		unsorted.put("karthi", 10);
		unsorted.put("ramu", 3);
		unsorted.put("eshwar", 2);
		unsorted.put("pooja", 4);
	
		unsorted.put("raju", 8);

		for (Entry<String, Integer> m : unsorted.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		Map<Employee, String> g = new HashMap<>();
		Employee emp = new Employee(1, "pooja", 20);
		Employee emp1 = new Employee(1, "pooja", 30);
		g.put(emp, "pooja");
		g.put(emp1, "deei");
		g.entrySet().forEach(System.out::println);
		g.get(emp);
		g.values().forEach(System.out::println);
		Empl e = new Empl("pooja");
		Empl e1 = new Empl("pooja");
		e = e1;

		String s = "pooja";
		System.out.println(e == e1);
		System.out.println(e.equals(e1));

		StringBuilder sb = new StringBuilder();

		// remove duplicate
		s.chars().distinct().forEach(c -> sb.append((char) c));
		System.out.println(sb);

		// remove duplicate
		StringBuilder sb1 = new StringBuilder();
		int l;
		for (int i = 0; i < s.length(); i++) {
			char str = s.charAt(i);
			l = s.indexOf(str, i + 1);
			if (l == -1) {
				sb1.append(str);
			}
		}
		System.out.println(sb1);
	}

}
