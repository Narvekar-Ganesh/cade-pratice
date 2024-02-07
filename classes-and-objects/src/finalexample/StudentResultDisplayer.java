package finalexample;

import java.util.List;

import generics.student.Student;

public class StudentResultDisplayer {

	public void display(List<Student> students) {
		for(Student eachStudent:students) {
			System.out.println("Student details are student's Name:"+ eachStudent.getName()+" and Marks:" + eachStudent.getMarks());
		}
		//TODO - write implementation here
		
	}
}