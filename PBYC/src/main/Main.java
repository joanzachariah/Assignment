package main;
import emp.Emp;
import manager.Manager;
public class Main {
	public static void main(String[] args) {
		Emp emp= new Emp();
		System.out.println(emp.calSal(10000));
		Manager manager= new Manager();
		System.out.println(manager.calSal(10000, 200));
	}

}
