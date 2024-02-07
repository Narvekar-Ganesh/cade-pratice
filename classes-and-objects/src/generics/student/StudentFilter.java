package generics.student;

import java.util.ArrayList;
import java.util.List;

public class StudentFilter {

	public List<Student> doFilter(List<Student> inputStudents){
		List<Student> filteredStudents = new ArrayList<Student>();
		for (Student eachstudent :inputStudents) {
			if (eachstudent.getMarks() >75) {
				filteredStudents.add(eachstudent);
			}
			
		} 
		
		return filteredStudents;
	}
}
