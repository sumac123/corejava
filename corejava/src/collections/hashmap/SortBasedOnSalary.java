package collections.hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortBasedOnSalary {
	public static void main(String[] args) {
		Employee emp=new Employee(1,"madhu",25000);
		Employee emp3=new Employee(1,"jadeja",34000);
		Employee emp1=new Employee(1,"dhoni",35000);
		Employee emp2=new Employee(1,"raina",45000);
		Employee emp4=new Employee(1,"yuvi",20000);
		Employee emp5=new Employee(1,"bajji",27000);
		
		
		HashMap<String, Employee> map=new HashMap<String, Employee>();
		map.put("d", emp);
		map.put("a", emp1);
		map.put("f", emp2);
		map.put("g", emp3);
		map.put("e", emp4);
		map.put("c", emp5);
		System.out.println("Before sorting");
		printMap(map);
		
		System.out.println("After sorting based on Salary");
		Map<String,Employee> mrc=sortedMap(map);
		printMap(mrc);
		
		
		
	}
	private static Map<String,Employee> sortedMap(HashMap<String, Employee> map) {
		
		List<Entry<String, Employee>> l=new LinkedList<Entry<String, Employee>>(map.entrySet());
		Collections.sort(l,new Comparator<Entry<String,Employee>>(){

			@Override
			public int compare(Entry<String, Employee> o1,
					Entry<String, Employee> o2) {
				
				return o2.getValue().getSalary()-o1.getValue().getSalary();
			}
			
			
			
		});
		
		Map<String,Employee> mc=new LinkedHashMap<String, Employee>();
		for(Entry<String,Employee> es:l){
			mc.put(es.getKey(), es.getValue());
			
		}
		
		
		return mc;
		
		
	}
	public static void printMap(Map<String,Employee> map){
		for(Map.Entry<String, Employee> m:map.entrySet()){
			System.out.println(m.getKey()+" = "+m.getValue().getId()+" "+m.getValue().getName()+" "+m.getValue().getSalary());
		}
		
	}
	
	
	

}
