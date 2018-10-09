package collections.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Conversion {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<String> slist = new ArrayList<>();
		for (Integer i : list) {
			slist.add(i.toString());
		}
		
		
		
		System.out.println("java7" + slist);

		List<String> newList = list.stream().map(s -> Integer.toString(s)).collect(Collectors.toList());
		//convert string to integer
		//List<String> newList = list.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
		System.out.println("java 8" + newList);

	}

}
