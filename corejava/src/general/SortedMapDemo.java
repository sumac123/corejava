package general;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
	public static void main(String[] args) {
		

	SortedMap< String,Integer> sm = new TreeMap<String,Integer>();
    sm.put( "practice",2);
    sm.put( "quiz",4);
    sm.put( "code",3);
    sm.put( "contribute",7);
    sm.put( "geeksforgeeks",5);
   /* Set<Entry<String,Integer>> s = sm.entrySet();
  

    for(Entry<String,Integer> es:s){
    	System.out.println(es.getKey()+" "+es.getValue());
    }*/
    
    List<Entry<String,Integer>> list=new LinkedList<Entry<String,Integer>>(sm.entrySet());
    Iterator<Entry<String,Integer>> itr=list.iterator();
    while(itr.hasNext()){
    	Entry<String, Integer> next = itr.next();
    	System.out.println(next.getKey()+" "+next.getValue());
    }
    
    
    
    
}
}
/* Iterator i = s.iterator();
while (i.hasNext()) {
    Map.Entry m = (Map.Entry)i.next();
    
    
    
    
    
    int key = (Integer)m.getKey();
    String value = (String)m.getValue();
   System.out.println( key +  "  " + value);
}*/