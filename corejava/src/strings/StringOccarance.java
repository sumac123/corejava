package strings;

import java.util.Map;
import java.util.stream.Collectors;

public class StringOccarance {

	public static void main(String[] args) {
		String s = "pooja1 is pooja1";
		char ch;
		int count = 0;
		for (char i = 'a'; i < 'z'; i++) {
			count = 0;

			for (int j = 0; j < s.length(); j++) {
				ch = s.charAt(j);
				if (ch == i) {
					count++;
				}
			}
			if (count != 0) {
				System.out.println(i + "=" + count);
			}

		}
		// java 8
		Map<Character, Integer> frequencies = s.chars().boxed()
				.collect(Collectors.toMap(k -> Character.valueOf((char) k.intValue()), v -> 1, Integer::sum)); // counting
		System.out.println("Frequencies:\n" + frequencies);

	}
}
