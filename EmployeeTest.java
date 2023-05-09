package oops;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee(1001, "Ashless","Shenoy", 300000);
		//Array of objects
		Employee[] emp1 = new Employee[10];
		emp1[0] = emp;
		System.out.println(emp.getName() + " is earning "
				+ emp.getSalary() + " per month");
		emp.setSalary(emp.raiseSalary(20));
		System.out.println(emp.getName() + " is earning "
				+ emp.getSalary() + " per month");		
	}

}