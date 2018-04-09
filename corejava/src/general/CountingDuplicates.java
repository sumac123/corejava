package general;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountingDuplicates {
	
	public static void main(String[] args) {
		 String s="java";
		 HashMap<Character,Integer> map=new HashMap<Character, Integer>();
		 char[] characters = s.toCharArray();
		
		for(Character c:characters){
			if(!map.containsKey(c)){
				map.put(c, 1);
				
			}
			else{
				map.put(c, map.get(c)+1);
			}
			
		}
		
		Set<Entry<Character, Integer>> set=map.entrySet();
		for(Entry<Character,Integer> entryset:set){
			if(entryset.getValue()>1){
				System.out.println(entryset.getKey()+":"+entryset.getValue());
			}
		}
		
		
	}

		
		
		
		
	
			
	}
	
