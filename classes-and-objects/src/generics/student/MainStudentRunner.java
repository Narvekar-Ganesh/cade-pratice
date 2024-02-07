package generics.student;

import java.util.ArrayList;
import java.util.List;

import staticexample.Employee;

public class MainStudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * StudentListGenerator studentListGenerator = new StudentListGenerator();
		 * List<Student> students = studentListGenerator.generate(); //
		 * System.out.println(students);
		 * 
		 * StudentFilter studentFilter = new StudentFilter(); students =
		 * studentFilter.doFilter(students); // System.out.println("After filtering:" +
		 * students );
		 * 
		 * StudentResultDisplayer studentResultDisplayer = new StudentResultDisplayer();
		 * studentResultDisplayer.display(students);
		 */
	
		genericsInMethod();
	}
	
	private static void genericsInMethod() {
		
		List<Object> objects = new ArrayList<Object>();

		Student student = new Student();
		
		MainStudentRunner mainStudentRunner = new MainStudentRunner(); 
		/*
		 * MainStudentRunner mainStudentRunner = new MainStudentRunner(); student =
		 * (Student)mainStudentRunner.addElement(student, objects) ; // without generics
		 * a consumer has to cast a returned object into required object // in this case
		 * consumer is tightly coupled with API // so to avoid this problem generics
		 * comes into the picture
		 * 
		 * Employee employee = new Employee(); employee =
		 * (Employee)mainStudentRunner.addElement(employee, objects);
		 */
		
		List<Student> students = new ArrayList<Student>();
		student = mainStudentRunner.addElementUsingGenerics(student, students);
		System.out.println("student we received as : " + student);
	}
	
	/**
	 * Method without generics
	 * @param objectToBeAdded
	 * @param objects
	 * @return
	 */
	private Object addElement(Object objectToBeAdded , List<Object> objects) {
		objects.add(objectToBeAdded);
		return objectToBeAdded;
	}

	
	/* This is an example of generics in methods
	 * T represents a generic data type
	 * <T> -> it should be added after declaring a modifier
	 */
	private <T>  T  addElementUsingGenerics(T objectToBeAdded, List<T> objects) {
		objects.add(objectToBeAdded);
		return objectToBeAdded;
	}
	
}
