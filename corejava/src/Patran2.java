public class Patran2 {

	public static void main(String[] args) {
		int rows = 3;
		int space = 2 * rows - 2;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			space=space-1;
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
