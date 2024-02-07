package home.practice.programrunner;

import java.util.List;

import home.practice.domain.Student;
import home.practice.generator.StudentListGenerator;
import home.practice.studentfilter.StudentByFilter;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentListGenerator studentListGenerator = new StudentListGenerator();
		List<Student> students = studentListGenerator.generate();
		System.out.println("Student List" + students);
		
		
		StudentByFilter studentByFilter = new StudentByFilter();
		 students =  studentByFilter.doFilter(students);
		System.out.println("After Filtering" + students);	
	}

}
