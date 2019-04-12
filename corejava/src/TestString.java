import javax.print.DocFlavor.INPUT_STREAM;

public class TestString {
	public static void main(String[] args) {
String s1="hi pooja how are you";
/*StringBuilder sb=new StringBuilder();
sb.append(s1);
System.out.println(sb.reverse()); //uoy era woh ajoop ih
String[] s2=s1.split(" ");
for(String s:s2){
	StringBuilder input = new StringBuilder();
	input.append(s);
	input=input.reverse();
	System.out.print(" "+input); // ih ajoop woh era uoy
	}
int i=3;

System.out.println(++i);*/
StringBuilder in = new StringBuilder("pooja");


in.insert(1, "Good");
System.out.println(in);

//Object myob=new String[] {"one","two"};
//for(String s:(String[])myob) {
	//System.out.println(s+".");

//}
//int r=(int) (Math.floor(Math.random()*8))+2;
//System.out.println(r);
	
String q="ram";
String q1="qm44555";

String q3="pooja";
String q4="pooja";
System.out.println(q==q1);
System.out.println(q==q3);
System.out.println(q==q4);


System.out.println(q4==q3);
System.out.println(q.charAt(0)>q1.charAt(0));
System.out.println(q1.charAt(0)>q.charAt(0));
//System.out.println(q.charAt(0)!=q1.charAt(0));
System.out.println(q.charAt(1));
//System.out.println(q1.charAt(4));
System.out.println(q1.equals(in) +",,,,"+in.equals(q1));

Object o=new Float(3.14F);
//Object[] oa=new Object[l];


	}

	
	
	
}
