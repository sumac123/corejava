package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateArrayList {

	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(1);
		a1.add(1);
		a1.add(0);
		a1.add(19);
		List<Integer> a2 = new ArrayList<Integer>();
		for (Integer i : a1) {
			if (!a2.contains(i)) {
				a2.add(i);
			}

		}
		System.out.println(a2);
		List<Integer> unique = a1.stream().distinct().collect(Collectors.toList());
		System.out.println("unique" + unique);

	}

}
