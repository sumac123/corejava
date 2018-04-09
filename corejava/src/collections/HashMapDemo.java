package collections;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		Employee emp=new Employee(1, "madhu", 32000);
		Employee emp1=new Employee(2,"kiran",35000);
		Employee emp2=new Employee(1, "madhu", 32000);
		
		
		HashMap<Employee, String> h=new HashMap<Employee, String>();
		 h.put(emp,"100");
		 h.put(emp1, "300");
		 h.put(emp2, "400");
		//System.out.println("put :"+put);
		//System.out.println(h);
		
		//System.out.println(put.equals(put2));
		System.out.println(h);
		System.out.println(h.size());
		
		System.out.println(emp.equals(emp2));
		System.out.println(emp==emp2);
		
		System.out.println("========================");
		HashMap<Integer,String> map=new HashMap<>();
		map.put(10,"madhu");
		map.put(10,"madhu");
		System.out.println(map);
		
	}

}
