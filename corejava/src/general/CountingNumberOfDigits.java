package general;

public class CountingNumberOfDigits {
	public static void main(String[] args) {
		int num = 12545;
		int n = num;
		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}

		System.out.println(count);
		System.out.println("==============");
		int rem = n % 10;
		int div = n / 10;

		num = (int) ((Math.pow(10, count - 1)) * rem) + div;

		System.out.println(num);

	}

}
