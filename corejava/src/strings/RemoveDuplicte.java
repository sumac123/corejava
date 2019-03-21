package strings;


public class RemoveDuplicte {

	public static void main(String[] args) {
String s="pooja";
char ch,ch1;
int count=0;
String s1=new String();
for (int i = 0; i < s.length(); i++) {
	
	
	for(int j=i+1;j<s.length();j++)
	{
		
		if(s.charAt(i)!=s.charAt(j))
		{
			
			s1=s1+s.charAt(j);
		}
	}
	
}
System.out.println(s1);
    }


}	

