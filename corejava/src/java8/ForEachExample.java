package java8;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 202, 29239, 28);
		list.forEach((t)->{
			System.out.println("t "+t);
		});
	}

}
