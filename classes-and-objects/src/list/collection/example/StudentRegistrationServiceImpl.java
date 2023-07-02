package list.collection.example;

import java.io.IOException;

public class StudentRegistrationServiceImpl implements StudentRegistrationService{

	public boolean registerStudent(Student student) throws IOException{
		StudentValidator studentValidator = new StudentValidator();
		
		boolean result = studentValidator.validateStudent(student);
		
		if(result == true) {
			//do register a student object. Persist 'student' object into the database.
		}
		
		return true;
	}

}
