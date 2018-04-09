package strings;

import java.util.Scanner;

public class ReverseString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] s1 = s.split(" ");
		System.out.println(s1[1].substring(0, 1).toUpperCase()
				+ s1[1].substring(1) + " "
				+ s1[0].substring(0, 1).toUpperCase() + s1[0].substring(1));

	}

}