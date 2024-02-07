package list.collection.example;

import staticexample.Employee;  

public class NullPointerExceptionDemonstrator {
	public static void main(String args[]) {
		Employee employee = new Employee();
//		employee = null;
//		System.out.println("Employee information : " + employee.toString());

		/*
		 * employee = null; System.out.println("Employee information : " +
		 * employee.toString());
		 */

		try {
			employee = null;
			System.out.println("Employee information : " + employee.toString());
		} catch (NullPointerException exception) {
			System.out.println("Employee cannot be null");
		} catch (StringIndexOutOfBoundsException exception) {
			System.out.println("Employee cannot be null");
		} catch (IndexOutOfBoundsException exception) {
			System.out.println("IndexOutOfBoundsException is occurred");
		} catch (Exception exception) {
			System.out.println("Exception : " + exception.toString());
			
		} finally {
			System.out.println("finally block is executed");
		}

		System.out.println("I am at end of line");
	}
}
