class Emp{
	String name;
	int id;
	int salary;
	String addr;
	
	
	public Emp(String name, int id, int salary, String addr) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", addr=" + addr + "]";
	}
	
	
	
}

public class Main {
	public static void main(String[] args) {
		Emp emp= new Emp("Joan", 10, 100000, "Borivali");
		System.out.println(emp.toString());
	}

}
