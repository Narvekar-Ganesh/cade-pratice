package list.collection.example;

import java.io.IOException;

public class StudentValidator {

	public boolean validateStudent(Student student) throws IOException {

		if (student == null) {
			throw new IOException("Student cannot be null");
		}

		if(student.getStudentName() == null) {
			throw new IOException("Student first name not be null");

		}
		if (student.getRollNumber() == 0) {
			throw new IOException("Student roll numberis zero");
		}
		
		/*
		 * try { if (student == null) { throw new IOException("Student cannot be null");
		 * } } catch (FileNotFoundException exception) {
		 * System.out.println("FileNotFoundException is occurred"); }catch(IOException
		 * exception) { System.out.println("IOException is occurred"); }
		 */

		/**
		 * Note : You cannot use both the approaches together. It will discourage the
		 * concept of "duck it or catch it". If we have both the approaches in this
		 * validate() method , you are going to discourage the responsibility of
		 * validate method. This validator class should only validate a given object and
		 * not additional responsibilities. This is one of principle of "SOLID" design
		 * principles.
		 * 
		 */
		return true;
	}

}
