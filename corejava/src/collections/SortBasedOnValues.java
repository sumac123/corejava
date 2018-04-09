package collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortBasedOnValues {
	
	public static void main(String[] args) {
		HashMap<String, Integer> h=new HashMap<String, Integer>();
		h.put("madhu",1);
		h.put("dhoni",5);
		h.put("raina",2);
		h.put("jadeja",4);
		h.put("sachin",3);
		
		//Set s=h.entrySet();
		
		//List l=new LinkedList(s);
	//System.out.println(l);
		
        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(h.entrySet());

		Collections.sort(list,new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}

		
		});
		
		h = new LinkedHashMap<String, Integer>();
	        for (Entry<String, Integer> entry : list)
	        {
	            h.put(entry.getKey(), entry.getValue());
	        }

		System.out.println(h);
		
	}
	
	

}
