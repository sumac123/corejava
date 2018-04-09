import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 4, 16, 1, 2, 3, 22 };
		int[] merge = new int[a.length + b.length];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			merge[i] = a[i];
			count++;
		}
		for (int j = 0; j < b.length; j++) {
			merge[count++] = b[j];
		}
		/*
		 * for(int i = 0;i<merge.length;i++) System.out.println(merge[i]+" ");
		 */

		for (int i = 0; i < merge.length; i++) {
			for (int j = i + 1; j < merge.length; j++) {
				int tmp = 0;
				if (merge[i] > merge[j]) {
					tmp = merge[i];
					merge[i] = merge[j];
					merge[j] = tmp;
				}
			}
		}
		// Arrays.sort(merge);
		System.out.println("The merged sorted array is: ");
		System.out.println(Arrays.toString(merge));

	}
}
