package list.collection.example;



public class EmployeeOperatorRunner {
	public static void main( String args[]) {
		//List<String> strings = new ArrayList<String>();
		//strings.add("employee");
		EmployeeOperator employeeOperator = new EmployeeOperator();
		employeeOperator.addEmployee("Nitin");
		employeeOperator.addEmployee("Mukesh");
		
		int index = 0;
		String employeeName = employeeOperator.getEmployeeName(index);
//		<employee name> + is present at + <index> + index.
		System.out.println(employeeName + " is present at "+index + " index");
		
//		Total number of employees are <result>
		int size = employeeOperator.getSize();
		System.out.println("Total number of employees are "  + size );
		
	}

}
