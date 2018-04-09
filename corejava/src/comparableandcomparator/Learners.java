package comparableandcomparator;

public class Learners {
	int id;
	String name;
	int age;
	int passedout;
	String from;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPassedout() {
		return passedout;
	}
	public void setPassedout(int passedout) {
		this.passedout = passedout;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public Learners(int id, String name, int age, int passedout, String from) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.passedout = passedout;
		this.from = from;
	}
	

}
