package patterns;

public class DimondPattran {

	public static void main(String[] args) {
		int n = 3;
		int space = n / 2, star = 1;
		// Outer for loop for number of lines
		for (int i = 1; i <= n; i++) {
			// Inner for loop for printing space
			for (int j = 1; j <= space; j++)
				System.out.print(" ");
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			// To goto next line
			System.out.println();
			if (i <= n / 2) {
				// space decreased by 1
				// star increased by 2
				space = space - 1;
				star = star + 2;
			}
			else {
				// space increased by 1
				// star decreased by 2
				space = space + 1;
				star = star - 2;
			}
		}

	}

}
