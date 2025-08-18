package program1.java;

public class Employee {
	String name;
	int id;
	long salary;
	Employee(String name,int id,long salary){
		this.name=name;
		this.id=id;
		this.salary=salary;		
	}
	//display
	void display() {
		System.out.println("employee name"+name);
		System.out.println("employee id"+id);
		System.out.println("employee salary"+salary);
	}
	void increase_salary(int p) {
		double increment=(salary*p)/100;
		salary+=increment;
		System.out.println("the increased salary is"+salary);
	}
}
