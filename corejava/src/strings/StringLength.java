package strings;

public class StringLength {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s = "hi pooja";
		int i = 0;
		char[] cArray = s.toCharArray();
		for (char c : cArray)

		{
			i++;
		}
		System.out.println("String length : " + i);

/*		int i1 = 0;
		try {
			while (true) {
				s.charAt(i1);
				i1++;
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("the length is " + i1);
		}*/
	}
}
