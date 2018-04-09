package general;

public class Test {
public static void main(String[] args) {
	String s="11";
	int parseInt = Integer.parseInt(s);
	System.out.println(parseInt+12);
	
	Integer valueOf = Integer.valueOf(parseInt);
	System.out.println(valueOf+11);
	
	String valueOf2 = String.valueOf(parseInt);
	System.out.println(valueOf2+22);
}
}
