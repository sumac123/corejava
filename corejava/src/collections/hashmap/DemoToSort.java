package collections.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DemoToSort {
	static final boolean ASC=true;
	static final boolean DES=false;

	public static void main(String[] args) {
		HashMap<String, Integer> unsorted = new HashMap<String, Integer>();
		unsorted.put("madhu", 7);
		unsorted.put("narendra", 10);
		unsorted.put("babu", 3);
		unsorted.put("pooja", 2);
		unsorted.put("amruta", 4);
		unsorted.put("praveen", 5);
		unsorted.put("jayasree", 8);
		System.out.println("Map before sorting...");
		printMap(unsorted);
		
		System.out.println("Map in Ascending Order of Values");
		Map<String,Integer> mc=sortedMap(unsorted, ASC);
		printMap(mc);
		
		System.out.println("Map in Descending Order of Values");
		Map<String,Integer> mc1=sortedMap(unsorted,DES);
		printMap(mc1);
		
		
	}
	
	public static Map<String,Integer> sortedMap(Map<String,Integer> m1, final boolean order){
		
		List<Entry<String,Integer>> list=new LinkedList<Entry<String,Integer>>(m1.entrySet());
		
		Collections.sort(list,new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				
				if(order){
				
				return o1.getValue().compareTo(o2.getValue());
				}
				else{
					return o2.getValue().compareTo(o1.getValue());
				}
			}

			
			
		});
		
		Map<String,Integer> maps=new LinkedHashMap<String, Integer>();
		
		for(Entry<String,Integer> entryset:list){
			maps.put(entryset.getKey(), entryset.getValue());
		}
		
		
		return maps;
		
		
	}
	
	
	
	public static void printMap(Map<String,Integer> m){
		for(Map.Entry<String, Integer> map:m.entrySet()){
			System.out.println(map.getKey()+": "+map.getValue());
			
		}
		
	}

}
