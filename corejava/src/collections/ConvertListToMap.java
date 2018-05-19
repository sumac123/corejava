package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertListToMap {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 6 };

		List<Integer> l = new ArrayList<Integer>();
		for (int b : a) {
			l.add(b);
		}
		System.out.println(l);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int c : l) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > 1) {
				System.out.println(e.getKey() + " ");
			}

		}

	}
}