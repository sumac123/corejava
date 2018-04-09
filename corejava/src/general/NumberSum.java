package general;

import java.util.Scanner;

public class NumberSum
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		int sum=0;
		int extendedsum=0;
		
		while(n>0)  //154
		{
			int a=n%10;  
			System.out.println(a);    //4 5 1
			sum=sum+a; 
			
			n=n/10;
		}
		System.out.println("sum of a num="+sum);//10

		while(sum>9||sum>0)
		{
			int a=sum%10; 
			System.out.println(a);//0 1
			extendedsum=extendedsum+a;  //1
			sum=sum/10;
		}
		System.out.println("the extended sum of a number is "+extendedsum);
	}

}
