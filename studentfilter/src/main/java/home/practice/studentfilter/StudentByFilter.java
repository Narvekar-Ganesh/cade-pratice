package home.practice.studentfilter;


import java.util.ArrayList;
import java.util.List;

import home.practice.domain.Student;


public class StudentByFilter {
	
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
