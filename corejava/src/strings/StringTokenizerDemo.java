package strings;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		

	String s=new String("Hello madhu");
	StringTokenizer token=new StringTokenizer(s);
	System.out.println(token.countTokens());
	while(token.hasMoreElements()){
		System.out.println(token.nextElement());
	}
	}
}
