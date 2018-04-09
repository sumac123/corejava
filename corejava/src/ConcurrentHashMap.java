import java.util.ArrayList;


public class ConcurrentHashMap {

	public static void main(String[] args) {
ArrayList<String> al=new ArrayList<>();
al.add("pooja");
al.add("deepi");
al.add("sound");
for(String s:al){
	System.out.println(s);
	
	al.add("eefdsf");
}
/*Iterator<String> it=al.iterator();
System.out.println(it.next());
al.add("dddd");*/
//it.remove();
	}

}
