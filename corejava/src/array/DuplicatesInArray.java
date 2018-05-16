package array;

public class DuplicatesInArray {
	public static void main(String[] args) {
		String s[] = { "pooja", "deepi", "pooja","deepi","soun" };
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equals(s[j]) && i != j) {
					System.out.println("duplicate elements " + s[j]);
				}

			}
		}
	}
}
