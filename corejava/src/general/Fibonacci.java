package general;

public class Fibonacci {

	public static void main(String[] args) 
	{
		int n=10;
		int f1=0;
		int f2=1;
		int f3;
		while(n>0)
		{
			System.out.print(f1+" ");
			f3=f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
	

	}

}
