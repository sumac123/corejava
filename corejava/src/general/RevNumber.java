package general;

public class RevNumber {
	public static void main(String[] args) {
		int n=123;
		int rev=0;
		
		while(n!=0){
			
			rev=rev*10;//0
			rev=rev+ n%10;//3
			n=n/10;//12
			
		}
		System.out.println(rev);
	}

}
