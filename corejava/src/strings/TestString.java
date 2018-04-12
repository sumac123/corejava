package strings;

public class TestString {
	public static void main(String[] args) {
		String s1 = "hi pooja how are you";
		StringBuilder sb = new StringBuilder();
		sb.append(s1);
		System.out.println(sb.reverse()); // uoy era woh ajoop ih
		String[] s2 = s1.split(" ");
		for (String s : s2) {
			StringBuilder input = new StringBuilder();
			input.append(s);
			input = input.reverse();
			System.out.print(" " + input); // ih ajoop woh era uoy
		}
		int i = 3;
	int j=2;	
	 j = i++;
		System.out.println(j);
	}

}
