package collections.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class IteratingMap {
	public static void main(String[] args) {
		SortedMap<String, Integer> unsorted = new TreeMap<String, Integer>();
		unsorted.put("madhu", 7);
		unsorted.put("narendra", 10);
		unsorted.put("babu", 3);
		unsorted.put("pooja", 2);
		unsorted.put("amruta", 4);
		unsorted.put("praveen", 5);
		unsorted.put("jayasree", 8);
		
		for(Entry<String, Integer> m:unsorted.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	
	
	}

}
