package collections.hashmap;

import java.util.HashMap;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	/*public static void main(String[] args) {
		Employee emp=new Employee(1,"amruta",30000);
		Employee emp1=new Employee(2,"jayasthree",30000);
		Employee emp2=new Employee(1,"amruta",30000);
		
		HashMap<String,Employee> m=new HashMap<String, Employee>();
		m.put("100", emp);
		m.put("200", emp1);
		m.put("300", emp2);
		System.out.println(m.size());
		System.out.println(emp.equals(emp2));
	

}*/
}