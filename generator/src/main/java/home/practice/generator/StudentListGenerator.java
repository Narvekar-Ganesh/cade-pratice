package home.practice.generator;


import java.util.ArrayList;
import java.util.List;

import home.practice.domain.Student;

public class StudentListGenerator {

	public List<Student> generate(){
		
		List<Student> students = new ArrayList<Student>();
		
		Student student = new Student();
		
		student.setRollNumber(10);
		student.setName("Sahil");
		student.setMarks(89);
		students.add(student);
		
		student.setRollNumber(20);
		student.setName("Swapnil");
		student.setMarks(99);
		students.add(student);
		
		student.setRollNumber(21);
		student.setName("Shouary");
		student.setMarks(93);
		students.add(student);
		
		
		return students ;
	}
}
