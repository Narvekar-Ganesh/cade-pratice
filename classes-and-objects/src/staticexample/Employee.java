package staticexample; 

public class Employee extends Object {
	static String companyName = "ABC";
	int joiningYear = 2022;

	private int employeeNumber;

	public Employee() {}
	
	public Employee(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	public String toString() {
		return"employee Number:"+ employeeNumber;
	}

	public static void main(String args[]) {
		
		Employee employee = new Employee();
		
		Employee employee2 = new Employee();
		employee.joiningYear = 2023;
		System.out.println(employee.joiningYear);
		System.out.println(employee2.joiningYear);
		System.out.println(employee.companyName);// It will work but it is highly discourage and readability of code is
													// low
		System.out.println(employee2.companyName);// It will work but it is highly discourage and readability of code is
													// low
		Employee.companyName = "My startup Cmpany";
		System.out.println(Employee.companyName);// this is proper way to call static variable a/

	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

}
