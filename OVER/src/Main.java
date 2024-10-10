class Emp{
	void emp1() {
		System.out.println("1");
	}
	void emp1(int a) {
		System.out.println(1000);
		}
}

public class Main {
	public static void main(String[] args) {
		Emp emp= new Emp();
		emp.emp1();
		emp.emp1(2);
		
	}
}
