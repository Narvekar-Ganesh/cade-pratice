package list.collection.example;

import java.io.IOException;

/**
 * 
 * This interface provides method to register a given student
 * 
 * @author Lenovo
 *
 */
public interface StudentRegistrationService {

	boolean registerStudent(Student student) throws IOException;
	
}
