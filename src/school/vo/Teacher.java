package school.vo;

public class Teacher extends Person {
	private int salary;

	public Teacher() {
		
	}
	public Teacher(String name, String id, String phone, int salary) {
		super(name, id, phone);
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		//setName("abc");
		//this.setName("abc");
		//super.setName("abc");
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		String s = super.toString() + " ±Þ¿©:" + salary;
		return s;
	}
}
