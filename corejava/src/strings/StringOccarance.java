package strings;

public class StringOccarance {

	public static void main(String[] args)
	{
		String s="pooja1 is pooja1";
		char ch;
		int count=0;
		for(char i='a';i<'z';i++)
		{
			count=0;
			
		
		for(int j=0;j<s.length();j++)
		{
			ch=s.charAt(j);
			if(ch==i)
			{
				count++;
			}
		}
		if(count!=0)
		{
			System.out.println(i+"="+count);
		}
	

	}
	}
}
