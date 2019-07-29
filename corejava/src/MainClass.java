
class C
	{
	    static int i = 1111;
	 
	    static
	    {
	        i = i-- - --i;
	        System.out.println("1ts "+i);
	    }
	 
	    {
	        i = i++ + ++i;
	        System.out.println("1st "+i);
	    }
	}
	 
	class B extends C
	{
	    static
	    {
	        i = --i - i--;
	        System.out.println("2st "+i);

	    }
	 
	    {
	        i = ++i + i++;
	        System.out.println("2st "+i);

	    }
	}
	
	class Q
	{
		int f() {
	        return (true ? null : 0);

		}
	}
	 
	public class MainClass
	{
	    public static void main(String[] args)
	    {
	        B b = new B();
	 
	        System.out.println(b.i);
	    }
	}


