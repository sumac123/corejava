package collections.hashmap;

import java.util.HashMap;

public final class Employee {
	
	private int id;
	private String name;
	private int salary;
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}




	public int getId() {
		return id;
	}


	
	public String getName() {
		return name;
	}


	


	public int getSalary() {
		return salary;
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