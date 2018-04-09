package practice.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortingHashMap {
   static final boolean ASC=true;
	static final boolean DSC=false;
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> unsorted = new HashMap<String, Integer>();
		unsorted.put("madhu", 7);
		unsorted.put("narendra", 10);
		unsorted.put("babu", 3);
		unsorted.put("pooja", 2);
		unsorted.put("amruta", 4);
		unsorted.put("praveen", 5);
		unsorted.put("jayasree", 8);
		unsorted.put("shanmukha",1);
		
		System.out.println("Map before sorting...");
		printMap(unsorted);
		System.out.println();
		System.out.println("Sorting in ascending order of values..");
		Map<String,Integer> map=sortedMap(unsorted,ASC);
		printMap(map);
		System.out.println();
		System.out.println("Sorting in descending order of values...");
		Map<String,Integer> map1=sortedMap(unsorted,DSC);
		printMap(map1);
	}
	
	
	private static Map<String, Integer> sortedMap(Map<String, Integer> unsorted,final boolean order) {
		
		List<Entry<String,Integer>> l=new LinkedList<Entry<String,Integer>>(unsorted.entrySet());
		Collections.sort(l,new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1,Entry<String, Integer> o2) {
				if(order){
				return o1.getValue().compareTo(o2.getValue());
				}
				else{
					return o2.getValue().compareTo(o1.getValue());
				}
			}

			
			
			
		});
		
		Map<String,Integer> maps=new LinkedHashMap<String, Integer>();
		for(Entry<String,Integer> es:l){
			maps.put(es.getKey(),es.getValue());
		}
		
		
		
		return maps;
	}


	public static void printMap(Map<String,Integer> m){
		for(Entry<String,Integer> es:m.entrySet()){
			System.out.println(es.getKey()+" "+es.getValue());
			}
		}
	
	
	

}
