package list.collection.example;

import java.awt.datatransfer.StringSelection;
import java.util.ArrayList;
import java.util.List;

import staticexample.Employee;

public class EmployeeOperator {

	private List<String> strings;
	private Employee employee;
	int sampleInt;

	public EmployeeOperator() {
		strings = new ArrayList<String>();
		employee = new Employee();
		sampleInt = 14;
	}

	public void addEmployee(String inputString) {
		/*
		 * System.out.println("employee is : " + employee);
		 * System.out.println("Strings is : " + strings);
		 * System.out.println("SampleInt is : " + sampleInt);
		 */

		boolean result = strings.add(inputString);
		if (result == true) {
			System.out.println(inputString + " is added successfully ");
		} else {
			System.out.println(inputString + "is not added successfully");
		}
		/*
		 * if boolean is true then print - <employee-name> is added successfully if
		 * boolean is false then print - <employee-name> is not added successfully
		 */
	}

	public String getEmployeeName(int index) {
		String employeeName = strings.get(index);

		return employeeName;

	}

	public int getSize() {
		// System.out.println("Total number of employees are : " + strings.size());
		int size = strings.size();
		return size;

	}

}
