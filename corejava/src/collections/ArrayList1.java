package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList();
		int maxIndex = 0;
		int minIndex = 0;
		li.add(3);
		li.add(2);
		li.add(213);
		li.add(22);
		li.add(11);
		li.add(20);
		System.out.println("max no.  " + Collections.max(li) + " and min value " + Collections.min(li));

		for (int i = 1; i < li.size(); i++) {
			if (li.get(i) < minIndex) {
				minIndex = li.get(i);
				minIndex = i;
			}
			if (li.get(i) > maxIndex) {
				maxIndex = li.get(i);
				minIndex = i;
			}
		}
		System.out.println("max value=" + maxIndex + " min value" + minIndex);

		// java 8 using stream
		Integer max2 = li.stream().max(Comparator.comparing(Integer::valueOf)).get();
		Integer min2 = li.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("  max2  " + max2 + " min2 " + min2);

		// remove numbers from string array
		List<String> list = new ArrayList<>();
		list.add("abc123");
		list.add("ab2");
		System.out.println("list" + list);
		List<String> list1 = new ArrayList<>();

		for (String s : list) {
			String s2 = "";

			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					s2 = s2 + s.charAt(i);
					System.out.println(s2 + "  " + s.charAt(i));

				}

			}
			list1.add(s2);
		}

		System.out.println("list");
		System.out.println(list1);
	}

}
