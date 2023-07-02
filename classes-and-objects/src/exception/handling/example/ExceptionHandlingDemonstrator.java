package exception.handling.example;

import java.util.ArrayList;
import java.util.List;

import staticexample.Employee;

public class ExceptionHandlingDemonstrator {

	public static void main(String[] args) { //calling method
		ExceptionHandlingDemonstrator demonstrator = new ExceptionHandlingDemonstrator();
		/*
		 * try{ demonstrator.exceptionHandling(); }catch(NullPointerException exception)
		 * { System.out.println("NullPointer Exception occurred : " +
		 * exception.getMessage()); }
		 */
		
//		demonstrator.exceptionHandlingWithMatchedCatchBlockAndFinallyBlock();
		
//		demonstrator.exceptionHandlingWithMatchedCatchBlockAndWithoutFinallyBlock();
		
		List<Employee>  employees = new ArrayList<Employee>();
		/*
		 * employees.add(new Employee(100)); employees.add(new Employee(200));
		 * employees.add(new Employee(300));
		 */
		
		demonstrator.processListOfEmployees(employees);
		
		System.out.println("*** In calling method - control comes back to this calling method");
	}

	
	private void exceptionHandlingWithMatchedCatchBlockAndWithoutFinallyBlock() {
		try {
			String testString = null;
			System.out.println("value of String : " + testString.toString());
		}catch(NullPointerException nullPointerException) {
			System.out.println("NullPointer Exception occurred : " + nullPointerException.getMessage());
		}
		System.out.println("No finally block is executed");
		
		
	}


	private void exceptionHandlingWithUnmatchedCatchBlock() {
		
		try {
			String testString = "asdad";
			System.out.println("value of String : " + testString.toString());
		}catch(ArithmeticException arithmeticException) {
			System.out.println("Arithmetic Exception occurred : " + arithmeticException.getMessage());
		}finally {
			System.out.println("Finally block exist ");
		}
		
		String testString = null;
		System.out.println("value of String : " + testString.toString());
	}
	
	private void exceptionHandlingWithMatchedCatchBlockAndFinallyBlock() {
		try {
			String testString = null;
//			System.exit(0); This is will get executed and program will get halted on this line.
			System.out.println("value of String : " + testString.toString());
//			System.exit(0); //This will not execute because this is a dead code as it will never get executed.
		}catch(NullPointerException nullPointerException) {
			System.out.println("NullPointer Exception occurred : " + nullPointerException.getMessage());
		}finally {
			System.out.println("Finally block exist ");
		}
		
		
		System.out.println("Line is executed after finally block");
		
	}
	
	private void processListOfEmployees(List<Employee> employees) {
		if(employees.isEmpty() == true) {
			throw new IllegalArgumentException("List of employees cannot be empty"); //it is used 
		}
		
		for(Employee eachEmployee:employees) {//for-each loop
			System.out.println("each Employee : " + eachEmployee.toString());
		}
		
	}
}
