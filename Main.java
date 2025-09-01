	package program1.java;
	
	public class Main {
	
		public static void main(String[] args) {
			Employee n1=new Employee("vicky",108,10000);
			Employee n2=new Employee("vijay",105,20000);
			System.out.println("initial employee details are");
			n1.display();
			n2.display();
			n1.increase_salary(10);
			n2.increase_salary(20);
		    System.out.println("updated employee details are");
		    n1.display();
		    n2.display();
		    
		}
	
	}
