package general;

public class Count_No_Inword
{

	public static void main(String[] args) 
	{
		String s = "1234554875588";
        int count=0;
		/*char c[]=s.toCharArray();
		for(char i='0';i<'9';i++)
		{
			if(c[i]=='0'||c[i]=='1'||c[i]=='2'||c[i]=='3'||c[i]=='4'||c[i]=='5'||
					c[i]=='6'||c[i]=='7'||c[i]=='8'||c[i]=='9')
		
			
                count++;		
             
		
		}
		System.out.println(count);*/
        
        for(char c : s.toCharArray()) 
        {
            if( c >= '0' && c<= '9')
            {
                count++;
            }
        }
        System.out.println(count);
	}

}
