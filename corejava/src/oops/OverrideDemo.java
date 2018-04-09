package oops;

public class OverrideDemo {
	public static void main(String[] args) {
		System.out.println("Inside main(String[] args) method ....");
	}

	public static void main(Integer[] args) {
		System.out.println("Inside main(Integer[] args) method ....");
	}

	/**
	 * * Another overloaded main method which accepts Double[] instead of *
	 * String[] as argument. * @param args
	 */
	public static void main(Double[] args) {
		System.out.println("Inside main(Double[] args) method ....");
	}
}
