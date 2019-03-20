package strings;

public class StringReverse {

	public static void main(String[] args) {
String s="pooja";
String reversed = rs(s);
System.out.println("The reversed string is: " + reversed);
StringBuilder reverse = new StringBuilder();

for(int i = s.length()-1; i > 0; i--){
	reverse =reverse.append(s.charAt(i));
	
}
System.out.println(reverse);


	}
public static String rs(String s) {
	if(s.isEmpty())
		return s;
	return rs(s.substring(1))+s.charAt(0);
}
}
