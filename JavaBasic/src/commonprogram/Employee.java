package commonprogram;

public class Employee {

	int emp_id;
	String emp_name;
	int salary;
	int dept_no;

//	Employee(int id, String name, int sal, int dept) {
//
//		emp_id = id;
//		emp_name = name;
//		salary = sal;
//		dept_no = dept;
//
//	}
	
	void setdata(int id, String name, int sal, int dept) {
		emp_id = id;
		emp_name = name;
		salary = sal;
		dept_no = dept;

		
		
		
		
	}
	void display() {

		System.out.println(emp_id);
		System.out.println(emp_name);
		System.out.println(salary);
		System.out.println(dept_no);
		System.out.println("**********************");

	}

	public static void main(String[] args) {
// Assign using object
//		Employee emp1 = new Employee();
//		emp1.emp_id = 1;
//		emp1.emp_name = "Saral";
//		emp1.salary = 3000;
//		emp1.dept_no = 16;
//
//		Employee emp2 = new Employee();
//		emp2.emp_id = 2;
//		emp2.emp_name = "Shubh";
//		emp2.salary = 2500;
//		emp2.dept_no = 14;
//
//		emp1.display();
//		emp2.display();
		
		//assign variable using constructor
		
//		Employee emp3 = new Employee(3,"Smitesh",2500,18);
//		emp3.display();
		
		
		//Assign variable using method
		
		Employee emp4 = new Employee();
		emp4.setdata(4, "Juli",2800, 12);
		emp4.display();
		
		

	}

}
