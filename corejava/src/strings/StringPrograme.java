package strings;

public class StringPrograme {

	public static void main(String[] args)
	{
		String s1=new String("YCCM");
		String s2=new String("YCCM");
		System.out.println(s1==s2);
		String s3="YCCM";
		String s4="YCCM";
		System.out.println(s3==s4);
		System.out.println(s1==s4);
		System.out.println(s1==s3);
		String s5="YC"+"CM";
		System.out.println(s3==s5);
		String s6="YC";
		String s7=s6+"CM";
		System.out.println(s3==s7);
		
		final String s8="YC";
		
		String s9=s8+"CM";
		
		String s10="YC";
		String s11=s10+"CM";
		System.out.println(s7==s11);
		System.out.println("===");
		System.out.println(s3==s11);
		
		System.out.println(s3==s9);
		System.out.println(s6==s8);
	/*	
		System.out.println("========================================");
		String t1="java";
		String t2="java";
		System.out.println("the output is"+t1.equals(t2));
		System.out.println("the output is"+t1==t2);
*/
	}

}
